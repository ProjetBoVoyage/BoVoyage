package fr.adaming.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.adaming.model.Admin;
import fr.adaming.model.Destination;
import fr.adaming.service.IAdminService;
import fr.adaming.service.IDestinationService;

@Controller
@RequestMapping("/destination")
@Scope("session")
public class DestinationController {
	
	//Transformation de l'asso UML en JAVA
	@Autowired
	private IDestinationService destService;
	@Autowired
	private IAdminService adminService;
	
	@SuppressWarnings("unused")
	private Admin admin;
	
	@PostConstruct
	public void init(){
	//Récupérer le contexte de Spring Security
		// Le j_username est stocké dans le contexte
		Authentication authCxt = SecurityContextHolder.getContext().getAuthentication();
		
		// Récupérer le mail à partir du context
		String mail=authCxt.getName();
		
		this.admin=adminService.getAdminByMail(mail); 

	}
	
	// ---------- Fonctionnalité ajouter
	
	@RequestMapping(value="/viewAdd", method=RequestMethod.GET)
	public String viewAdd(Model modele){
		//Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("destAdd", new Destination());
		return "addDestinationPage";
	}
	
	@RequestMapping(value="/submitAdd", method=RequestMethod.POST)
	public String submitAdd(@ModelAttribute("destAdd") Destination dIn, RedirectAttributes ra){
		//Appel de la méthode service
		destService.add(dIn);
		
		return "redirect:viewDest";
		
	}
	
	// ---------- Fonctionnalité getAll
	@RequestMapping(value="/viewDest", method=RequestMethod.GET)
	public ModelAndView viewListDest(){
		
		return new ModelAndView("viewAllDestinationPage", "listDest", destService.getAll());
	}

	}
	


