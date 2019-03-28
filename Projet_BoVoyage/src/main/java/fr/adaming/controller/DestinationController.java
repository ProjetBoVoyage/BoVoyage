package fr.adaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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

	// Transformation de l'asso UML en JAVA
	@Autowired
	private IDestinationService destService;
	// @Autowired
	// private IAdminService adminService;

	@SuppressWarnings("unused")
	private Admin admin;

	// @PostConstruct
	// public void init() {
	// // Récupérer le contexte de Spring Security
	// // Le j_username est stocké dans le contexte
	// Authentication authCxt =
	// SecurityContextHolder.getContext().getAuthentication();
	// // Récupérer le mail à partir du context
	// String mail = authCxt.getName();
	// this.admin = adminService.getAdminByMail(mail);
	// }

	/** METHODE AJOUTER DESTINATION */
	// Afficher le Formulaire
	@RequestMapping(value = "/viewAdd", method = RequestMethod.GET)
	public String viewAdd(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("destAdd", new Destination());
		return "addDestinationPage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitAdd", method = RequestMethod.POST)
	public String submitAdd(@ModelAttribute("destAdd") Destination dIn, RedirectAttributes ra) {
		// Appel de la méthode service
		int test = destService.add(dIn);
		if (test != 0) {
			return "redirect:viewDest";
		} else {
			ra.addFlashAttribute("msg","Adding Destination Failed");
			return "redirect:viewAdd";
		}
		
	}

	/** METHODE MODIFIER UNE DESTINATION */
	@RequestMapping(value = "/viewUpdate", method = RequestMethod.GET)
	public String viewUpdate(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("destUpdate", new Destination());
		return "updateDestinationPage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitUpdate", method = RequestMethod.POST)
	public String submitUpdate(@ModelAttribute("destUpdate") Destination dIn, RedirectAttributes ra) {
		// Appel de la méthode service
		int test = destService.update(dIn);
		if (test != 0) {
			return "redirect:viewDest";
		} else {
			ra.addFlashAttribute("msg","Updating Destination Failed");
			return "redirect:viewUpdate";
		}
	}

	/** METHODE SUPPRIMER UNE DESTINATION */
	@RequestMapping(value = "/viewDelete", method = RequestMethod.GET)
	public String viewDelete(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("destDelete", new Destination());
		return "deleteDestinationPage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitDelete", method = RequestMethod.POST)
	public String submitDelete(@ModelAttribute("destDelete") Destination dIn, RedirectAttributes ra) {
		// Appel de la méthode service
		int test = destService.delete(dIn);
		if (test != 0) {
			return "redirect:viewDest";
		} else {
			ra.addFlashAttribute("msg","Deleting Destination Failed");
			return "redirect:viewDelete";
		}
	}

	/** METHODE RECHERCHER UNE DESTINATION */
	@RequestMapping(value = "/viewSearch", method = RequestMethod.GET)
	public String viewSearch(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("destSearch", new Destination());
		return "searchDestinationPage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitDelete", method = RequestMethod.POST)
	public String submitSearch(@ModelAttribute("destDelete") Destination dIn, RedirectAttributes ra) {
		// Appel de la méthode service
		Destination dOut = destService.getById(dIn.getIdDest());
		if (dOut != null) {
			return "redirect:viewSearch";
		} else {
			ra.addFlashAttribute("msg","Searching Destination Failed");
			return "redirect:viewSearch";
		}
	}

	/** METHODE AFFICHER TOUTES DESTINATIONS */
	// Afficher le tableau
	@RequestMapping(value = "/viewDest", method = RequestMethod.GET)
	public ModelAndView viewListDest() {
		return new ModelAndView("viewAllDestinationPage", "listDest", destService.getAll());
	}

}
