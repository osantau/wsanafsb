package oct.soft.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import oct.soft.BaseObject;
import oct.soft.CompanyInfo;
import oct.soft.CompanyReqInfo;

@Controller
public class HomeController {

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${anaf.url")
	private String ANAFURL;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("reqInfo", new CompanyReqInfo());		
		return "home";
	}

	@PostMapping("/")
	public String punctualCheck(@ModelAttribute CompanyReqInfo reqInfo, Model model) throws JsonProcessingException {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
		List<CompanyReqInfo> arr = new ArrayList<CompanyReqInfo>();
		arr.add(reqInfo);
		HttpEntity<String> request = new HttpEntity<String>(mapper.writeValueAsString(arr), headers);
		BaseObject baseObject = restTemplate.postForObject(ANAFURL,
				request, BaseObject.class);
		CompanyInfo companyInfo = null;

		if (!baseObject.getFound().isEmpty()) {
			companyInfo = baseObject.getFound().get(0);
		}
		model.addAttribute("companyInfo", companyInfo);
		model.addAttribute("reqInfo", reqInfo);
		return "home";
	}

	@PostMapping("/upload-file")
	public void handleFileUpload(@RequestParam("file") MultipartFile file, HttpServletResponse response) {
		try {
			XSSFWorkbook wb = new XSSFWorkbook(file.getInputStream());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			List<CompanyReqInfo> reqInfos = new ArrayList<CompanyReqInfo>();

			wb.getSheetAt(0).forEach(row -> {

				if (row.getRowNum() > 1) {
					reqInfos.add(new CompanyReqInfo(Double.valueOf(row.getCell(1).getNumericCellValue()).longValue(),
							sdf.format(row.getCell(0).getDateCellValue())));
				}

			});			
			
			System.out.println(reqInfos);
			
			/*response.setContentType("application/octet-stream");
			String headerKey = "Content-Disposition";
			String headerValue = "attachment; filename=Rezultat.xlsx";
			response.setHeader(headerKey, headerValue);
			 ServletOutputStream outputStream = response.getOutputStream();
		        wb.write(outputStream);
		        wb.close();
		         
		        outputStream.close();
		        wb.close(); */
		} catch (Exception e) {
			e.printStackTrace();
		}

	         
	}
}
