package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.adaming.model.Customer;
import fr.adaming.model.Insurance;
import fr.adaming.service.ICustomerService;

@Controller
@RequestMapping("/customer")
@Scope("session")
public class CustoController {

	// tranformation UML en JAVA
	@Autowired
	private ICustomerService custoService;

	/** methode Add custo */
	// Affiche formulaire
	@RequestMapping(value = "/viewAddCusto", method = RequestMethod.GET)
	public String viewAddCusto(Model modele) {
		// link Insurance to model MVC
		modele.addAttribute("custoAdd", new Customer());
		return "addCustomerPage";
	}

	// submit formulaire
	@RequestMapping(value = "/submitAddCusto", method = RequestMethod.POST)
	public String submitAddCusto(@ModelAttribute("custoAdd") Customer cuIn, RedirectAttributes ra) {
		// appel method service
		int test = custoService.add(cuIn);

		if (test != 0) {
			return "redirect:viewCusto";
		} else {
			ra.addAttribute("msg", "Adding Customer Failed!");
			return "redirect:viewAddCusto";
		}
	}

	/** METHODE MODIFIER UN CUSTOMER */
	@RequestMapping(value = "/viewUpdateCusto", method = RequestMethod.GET)
	public String viewUpdateCusto(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("custoUpdate", new Customer());
		return "updateCustomerPage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitUpdatCustoe", method = RequestMethod.POST)
	public String submitUpdateCusto(@ModelAttribute("CustoUpdate") Customer cuIn, RedirectAttributes ra) {
		// Appel de la méthode service
		int test = custoService.update(cuIn);
		if (test != 0) {
			return "redirect:viewCusto";
		} else {
			ra.addFlashAttribute("msg", "Updating Customer Failed");
			return "redirect:viewUpdateCusto";
		}
	}
	
	/** METHODE SUPPRIMER UN CUSTOMER */
	@RequestMapping(value = "/viewDeleteCusto", method = RequestMethod.GET)
	public String viewDeleteCusto(Model modele) {
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("custoDelete", new Customer());
		return "deleteCustomerPage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitDeleteCusto", method = RequestMethod.POST)
	public String submitDeleteCusto(@ModelAttribute("custoDelete") Customer cuIn, RedirectAttributes ra) {
		// Appel de la méthode service
		int test = custoService.delete(cuIn);
		if (test != 0) {
			return "redirect:viewCusto";
		} else {
			ra.addFlashAttribute("msg", "Deleting Customer Failed");
			return "redirect:viewDeleteCusto";
		}
	}
	
	/** METHODE RECHERCHER UN CUSTOMER */
	@RequestMapping(value = "/viewSearchCusto", method = RequestMethod.GET)
	public String viewSearchCusto(Model modele) {
		List<Customer> customers = custoService.getAll();
		modele.addAttribute("customers", customers);
		// Lier la destination au modele MVC afin de l'utiliser
		modele.addAttribute("custoSearch", new Customer());
		return "searchCustomerPage";
	}

	// Soumettre le formulauire
	@RequestMapping(value = "/submitSearchCusto", method = RequestMethod.POST)
	public ModelAndView submitSearchCusto(@ModelAttribute("custoSearch") Customer cuIn, Model modele) {
		List<Customer> customers = custoService.getAll();
		modele.addAttribute("customers", customers);
		return new ModelAndView("searchCustomerPage", "customers", custoService.getById(cuIn.getId()));

	}
	
	/** METHODE AFFICHER TOUS CUSTOMERS */
	// Afficher le tableau
	@RequestMapping(value = "/viewCusto", method = RequestMethod.GET)
	public ModelAndView viewListCusto() {
		return new ModelAndView("viewAllCustoPage", "listCusto", custoService.getAll());
	}

}
