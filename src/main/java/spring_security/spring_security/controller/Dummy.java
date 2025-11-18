package spring_security.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Dummy {
	
	@GetMapping("/secure")
	public String getmsg(){
		return "only users can access";
	}
	
	@GetMapping("/public")
	public String gethi(){
		return "Anyone can access";
	}
	
	@GetMapping("/admin")
	public String gethello(){
		return "Only admins can access";
	}

}
