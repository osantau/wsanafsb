package oct.soft;

import java.awt.Desktop;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GsConsumingRestApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GsConsumingRestApplication.class, args);
		if (!GraphicsEnvironment.isHeadless()) {
			openHomePage("http://localhost:8080");
		}

		
//		 XSSFWorkbook wb = new XSSFWorkbook("e:/aa/cuis.xlsx"); SimpleDateFormat sdf =
//		 new SimpleDateFormat("yyyy-MM-dd"); List<CompanyReqInfo> reqInfos = new
//		 ArrayList<CompanyReqInfo>(); wb.getSheetAt(0).forEach(row -> {
//		 System.out.println(row.getCell(1));
//		 reqInfos.add( new CompanyReqInfo(
//		 Long.valueOf(row.getCell(1).toString()).longValue(),sdf.format(
//		 row.getCell(0).getDateCellValue()))); }); System.out.println(reqInfos);
//		 wb.close();
//		 List<List<CompanyReqInfo>> subsets = ListUtils.partition(reqInfos, 500);
//		 subsets.forEach(lst->{
//			 System.out.println(lst.size());
//		 });
	}

	private static void openHomePage(String url) {
		if (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URI(url));
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
		} else {
			Runtime runtime = Runtime.getRuntime();
			try {
				runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) throws Exception {

		final TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			@Override
			public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType)
					throws CertificateException {
			}

			@Override
			public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)
					throws CertificateException {
			}

			@Override
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return new java.security.cert.X509Certificate[] {};
			}
		} };

		final SSLContext sslContext = SSLContext.getInstance("SSL");
		sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
		// Create an ssl socket factory with our all-trusting manager
		final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

		CloseableHttpClient httpClient = HttpClients.custom().setSSLContext(sslContext)
				.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE).build();

		HttpComponentsClientHttpRequestFactory customRequestFactory = new HttpComponentsClientHttpRequestFactory();

		customRequestFactory.setHttpClient(httpClient);

		return builder.requestFactory(() -> customRequestFactory).build();

	}
	/*
	 * @Bean public CommandLineRunner run(RestTemplate restTemplate) throws
	 * Exception {
	 * 
	 * return args->{ HttpHeaders headers = new HttpHeaders();
	 * headers.setContentType(MediaType.APPLICATION_JSON);
	 * 
	 * CompanyReqInfo companyReqInfo = new CompanyReqInfo(54744,"2021-01-11");
	 * ObjectMapper mapper = new
	 * ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
	 * List<CompanyReqInfo> arr = new ArrayList<CompanyReqInfo>();
	 * arr.add(companyReqInfo); System.out.println(mapper.writeValueAsString(arr));
	 * HttpEntity<String> request = new
	 * HttpEntity<String>(mapper.writeValueAsString(arr),headers); BaseObject
	 * baseObject = restTemplate.postForObject(
	 * "https://webservicesp.anaf.ro/PlatitorTvaRest/api/v6/ws/tva", request,
	 * BaseObject.class);
	 * 
	 * System.out.println(baseObject.getFound().get(0)); }; }
	 */
}
