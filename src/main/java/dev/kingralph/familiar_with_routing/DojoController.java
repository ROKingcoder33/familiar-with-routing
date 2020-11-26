package dev.kingralph.familiar_with_routing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DojoController {
	
	@GetMapping("{location}")
	public String showLocation(@PathVariable("location") String location) {
		if(location.equals("dojo")) {
			location = "The dojo is awesome!";
		} 
		else if(location.equals("burbank-dojo")) {
			location = "Burbank Dojo is located in Southern California";
		} 
		else if(location.equals("san-jose")) {
			location = "SJ dojo is the headquarters";
		}
		return location;
	}

}
