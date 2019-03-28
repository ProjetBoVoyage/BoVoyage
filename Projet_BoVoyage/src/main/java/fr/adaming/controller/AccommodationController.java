package fr.adaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.adaming.model.Destination;
import fr.adaming.service.IAccommodationService;

@Controller
@RequestMapping("/accommodation")
@Scope("session")
public class AccommodationController {
	
	// Transformation de l'asso UML en JAVA
	@SuppressWarnings("unused")
	@Autowired
	private IAccommodationService accService;
	
	@RequestMapping(value = "/viewAdd", method = RequestMethod.GET)
	public String viewAdd(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("accAdd", new Destination());
		return "addAccommodationPage";
	}

	// Soumettre le formulauire
//	@RequestMapping(value = "/submitAdd", method = RequestMethod.POST)
//	public String submitAdd(@ModelAttribute("accAdd") Accommodation accIn, RedirectAttributes ra) {
//		// Appel de la méthode service
//		accService.add(accIn);
//		return "redirect:viewAcc"; 
//	}


}
