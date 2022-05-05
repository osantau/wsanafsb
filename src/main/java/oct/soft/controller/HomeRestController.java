package oct.soft.controller;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import javax.naming.spi.ResolveResult;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections4.ListUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

import oct.soft.BaseObject;
import oct.soft.CompanyInfo;
import oct.soft.CompanyReqInfo;

@RestController
@RequestMapping("/api")
public class HomeRestController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${anaf.url}")
	private String ANAFURL;

	@PostMapping("/check")
	public ResponseEntity<CompanyInfo> punctualCheck(@RequestBody CompanyReqInfo reqInfo)
			throws JsonProcessingException {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
		List<CompanyReqInfo> arr = new ArrayList<CompanyReqInfo>();
		arr.add(reqInfo);
		HttpEntity<String> request = new HttpEntity<String>(mapper.writeValueAsString(arr), headers);
		BaseObject baseObject = restTemplate.postForObject(ANAFURL, request, BaseObject.class);
		CompanyInfo companyInfo = null;

		if (!baseObject.getFound().isEmpty()) {
			companyInfo = baseObject.getFound().get(0);
			return new ResponseEntity<CompanyInfo>(companyInfo, HttpStatus.OK);
		}
		return new ResponseEntity<CompanyInfo>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/filecheck")
	public void handleFileUpload(@RequestParam("file") MultipartFile file, HttpServletResponse response) {
		try {
			XSSFWorkbook wb = new XSSFWorkbook(file.getInputStream());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			List<CompanyReqInfo> reqInfos = new ArrayList<CompanyReqInfo>();

			wb.getSheetAt(0).forEach(row -> {
				reqInfos.add(new CompanyReqInfo(Long.valueOf(row.getCell(1).toString()).longValue(),
						sdf.format(row.getCell(0).getDateCellValue())));
			});
			wb.close();

			List<List<CompanyReqInfo>> subsets = ListUtils.partition(reqInfos, 500);
			List<BaseObject> responseList = new ArrayList<BaseObject>();

			subsets.forEach(lst -> {
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
				HttpEntity<String> request = null;
				try {
					request = new HttpEntity<String>(mapper.writeValueAsString(lst), headers);
				} catch (JsonProcessingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				responseList.add(restTemplate.postForObject(ANAFURL, request, BaseObject.class));

				if (subsets.size() > 1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			});

			response.setContentType("application/octet-stream");
			String headerKey = "Content-Disposition";
			String headerValue = "attachment; filename=rezultat.xlsx";

			wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet();
			Row row = sheet.createRow(0);

			Field[] fieldsInfo = CompanyInfo.class.getDeclaredFields();
			int cellIdx = 0;

			for (Field field : fieldsInfo) {
				row.createCell(cellIdx).setCellValue(field.getName());
				cellIdx++;
			}

			sheet.setAutoFilter(new CellRangeAddress(0, 0, 0, cellIdx));
			sheet.createFreezePane(0, 1);

			final AtomicInteger ai = new AtomicInteger(1);

			responseList.forEach(lst -> {				
				lst.getFound().forEach(ci -> {
					Row r = sheet.createRow(ai.getAndIncrement());
					final AtomicInteger aic = new AtomicInteger();
					ci.getValues().forEach(val -> {
						r.createCell(aic.getAndIncrement()).setCellValue(val == null ? "" : val.toString());
					});
				});
			});

			response.setHeader(headerKey, headerValue);
			ServletOutputStream outputStream = response.getOutputStream();
			wb.write(outputStream);
			wb.close();
			outputStream.close();
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}