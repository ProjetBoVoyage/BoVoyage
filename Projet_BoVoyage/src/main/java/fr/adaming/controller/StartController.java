package fr.adaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/start")
public class StartController {

	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String displayWelcomePage() {
		return "homePage";
	}
	
	@RequestMapping(value="/customerPage", method=RequestMethod.GET)
	public String displayCustomerSpacePage() {
		return "customerPage";
	}
	@RequestMapping(value="/admin/adminPage", method=RequestMethod.GET)
	public String displayAdminSpacePage() {
		return "adminPage";
	}
}
