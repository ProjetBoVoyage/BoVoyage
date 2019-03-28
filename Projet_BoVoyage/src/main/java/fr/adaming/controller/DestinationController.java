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
@RequestMapping("/admin")
@Scope("session")
public class DestinationController {
	
	//Transformation de l'asso UML en JAVA
	@Autowired
	private IDestinationService destService;
	@Autowired
	private IAdminService adminService;
	
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
		return "adminPage";
	}
	
	@RequestMapping(value="/submitAdd", method=RequestMethod.POST)
	public String submitAdd(@ModelAttribute("destAdd") Destination dIn, RedirectAttributes ra){
		//Appel de la méthode service
		Destination dOut = destService.add(dIn);
		
		if(dOut.getIdDest()!=0){
			return "redirect:listDest";
		}else{
			ra.addFlashAttribute("msg", "L'ajout a échoué");
			return "redirect:viewAdd";
		}
		
	}
	
	// ---------- Fonctionnalité getAll
	@RequestMapping(value="/listDest", method=RequestMethod.GET)
	public ModelAndView viewList(){
		
		return new ModelAndView("adminPage", "listDest", destService.getAll());
	}
	

}
