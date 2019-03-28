package fr.adaming.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.adaming.model.Flight;
import fr.adaming.service.IFlightService;

@Controller
@RequestMapping("/flight")
@Scope("session")
public class FlightController {
	// tranformation UML en JAVA
	@Autowired
	private IFlightService fligService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat dt = new SimpleDateFormat("hh:mm");

		df.setLenient(false);
		dt.setLenient(false);

		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dt, false));
	}

	/** methode Add Flight */
	// Affiche formulaire
	@RequestMapping(value = "/viewAdd", method = RequestMethod.GET)
	public String viewAdd(Model modele) {
		// link Insurance to model MVC
		modele.addAttribute("fligAdd", new Flight());
		return "addFlightPage";
	}

	// submit formulaire
	@RequestMapping(value = "/submitAdd", method = RequestMethod.POST)
	public String submitAdd(@ModelAttribute("fligAdd") Flight fIn, RedirectAttributes ra) {
		// appel method service
		int test = fligService.add(fIn);

		if (test != 0) {
			return "redirect:viewFlig";
		} else {
			ra.addAttribute("msg", "Adding Flight Failed!");
			return "redirect:viewAdd";
		}
	}

	/** METHODE MODIFIER UN Flight */
	@RequestMapping(value = "/viewUpdate", method = RequestMethod.GET)
	public String viewUpdate(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("destUpdate", new Flight());
		return "updateFlightPage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitUpdate", method = RequestMethod.POST)
	public String submitUpdate(@ModelAttribute("fligUpdate") Flight fIn, RedirectAttributes ra) {
		// Appel de la méthode service
		int test = fligService.update(fIn);
		if (test != 0) {
			return "redirect:viewFlig";
		} else {
			ra.addFlashAttribute("msg", "Updating Flight Failed");
			return "redirect:viewUpdate";
		}
	}

	@RequestMapping(value = "/updateLink", method = RequestMethod.GET)
	public String modifLien(Model modele, @RequestParam("pId") int id) {
		Flight fIn = new Flight();
		fIn.setIdFlight(id);
		Flight fOut = fligService.getById(id);

		modele.addAttribute("fligUpdate", fOut);

		return "updateFlightPage";
	}

	/** METHODE SUPPRIMER UN Flight */
	@RequestMapping(value = "/viewDelete", method = RequestMethod.GET)
	public String viewDelete(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("fligDelete", new Flight());
		return "deleteFlightPage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitDelete", method = RequestMethod.POST)
	public String submitDelete(@ModelAttribute("fligDelete") Flight fIn, RedirectAttributes ra) {
		// Appel de la méthode service
		int test = fligService.delete(fIn);
		if (test != 0) {
			return "redirect:viewFlig";
		} else {
			ra.addFlashAttribute("msg", "Deleting Flight Failed");
			return "redirect:viewDelete";
		}
	}

	@RequestMapping(value = "/deleteLink", method = RequestMethod.GET)
	public String supprLien(@RequestParam("pId") int id) {
		Flight fIn = new Flight();
		fIn.setIdFlight(id);
		fligService.delete(fIn);

		return "redirect:viewInsu";
	}

	/** METHODE RECHERCHER UN FLIGHT */
	@RequestMapping(value = "/viewSearch", method = RequestMethod.GET)
	public String viewSearch(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("fligSearch", new Flight());
		return "searchInsurancePage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitSearch", method = RequestMethod.POST)
	public String submitSearch(@ModelAttribute("fligSearch") Flight fIn, RedirectAttributes ra) {
		// Appel de la méthode service
		Flight fOut = fligService.getById(fIn.getIdFlight());
		if (fOut != null) {
			return "redirect:viewSearch";
		} else {
			ra.addFlashAttribute("msg", "Searching Flight Failed");
			return "redirect:viewSearch";
		}
	}

	/** METHODE AFFICHER TOUS Flight */
	// Afficher le tableau
	@RequestMapping(value = "/viewFlig", method = RequestMethod.GET)
	public ModelAndView viewListDest() {
		return new ModelAndView("viewAllFlightPage", "listFlig", fligService.getAll());
	}

}
