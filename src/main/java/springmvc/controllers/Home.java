package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Home {

	@RequestMapping("/home")
	public String getHome() {
		return "home";
	}
	
	@RequestMapping("/menu")
	public String getMenu() {
		return "menu";
	}
	
}
