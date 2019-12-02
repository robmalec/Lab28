package co.grandcircus.Lab28Attempt2;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView home() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Testing!");

		String url = "http://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&Fcs tType=json";
		
		ResponseEntity<String> response = rt.exchange(url,  HttpMethod.GET,new HttpEntity<String>("parameters",headers),String.class);
		
		return new ModelAndView("index","forecast",response.getBody());
	}

}
