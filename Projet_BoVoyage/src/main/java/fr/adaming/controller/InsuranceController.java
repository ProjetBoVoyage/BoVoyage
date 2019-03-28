package fr.adaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.adaming.model.Admin;
import fr.adaming.model.Insurance;
import fr.adaming.service.IInsuranceService;

@Controller
@RequestMapping("/insurance")
@Scope("session")

public class InsuranceController {

	// tranformation UML en JAVA
	@Autowired
	private IInsuranceService insuService;

	/** methode Add Insurance */
	// Affiche formulaire
	@RequestMapping(value = "/viewAdd", method = RequestMethod.GET)
	public String viewAdd(Model modele) {
		// link Insurance to model MVC
		modele.addAttribute("insuAdd", new Insurance());
		return "addInsurancePage";
	}

	// submit formulaire

	// public String submitAdd(@ModelAttribute("insuAdd") Insurance iIn,
	// RedirectAttributes ra,)
}
