package de.allianz.demo.app;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * A simple hello world controller that proxies basic-auth from the URL to
 * HTTP-Headers
 * <p>
 * Created by d22j2n3 on 04.04.2017.
 */
@Controller
public class BasicAuthController {

	private String url = "https://eamrepository.muc.allianz:9443/iteraplan/api/data/informationsystem";
	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping(value="/proxy/{query}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)    		
    public @ResponseBody String proxy(@PathVariable("query") String query) {
    		
		System.setProperty("https.protocols", "TLSv1");
		System.setProperty("https.proxyHost", "surf.proxy.agis.allianz");
	    	System.setProperty("https.proxyPort", "8080");

		HttpHeaders headers = createHttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		ResponseEntity<String> response = null;
		try {
			response = this.restTemplate.exchange(url + query, HttpMethod.GET, entity, String.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (response == null) {
			return "Error";
		}
		
		return response.getBody();
    }

	private HttpHeaders createHttpHeaders() {
//		String notEncoded = "Basic " + user + ":" + password;
//		String encodedAuth = new String(Base64.encodeBase64(notEncoded.getBytes()));
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Basic bGVhcC1zdXBwb3J0OjlnREc5UllmZ0ptYXQ5dzU="); // user leap-support
		return headers;
	}
}
