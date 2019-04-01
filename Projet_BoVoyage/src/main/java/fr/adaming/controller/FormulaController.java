package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.adaming.model.Accommodation;
import fr.adaming.model.Flight;
import fr.adaming.service.IAccommodationService;
import fr.adaming.service.IDestinationService;
import fr.adaming.service.IFlightService;

@Controller
@RequestMapping("/formula")
@Scope("session")
public class FormulaController {
	
	// Transformation de l'asso UML en JAVA
	@Autowired
	private IDestinationService destService;

	@Autowired
	private IFlightService fliService;
	@Autowired
	private IAccommodationService accService;

	@RequestMapping(value = "/viewFlight", method = RequestMethod.GET)
	public ModelAndView viewFlightForm(@RequestParam("pDest") @ModelAttribute("destSearch") int idDest, Model modele) {
		
		List<Flight> listFli = fliService.getFliByDestination(destService.getById(idDest));
		modele.addAttribute("listFliDest", listFli);
		
		return new ModelAndView("formulaFlight", "destination", destService.getById(idDest));

	}
	
	@RequestMapping(value = "/viewHotel", method = RequestMethod.GET)
	public ModelAndView viewHotelForm(@RequestParam("pDest") @ModelAttribute("destSearch") int idDest, Model modele) {
		
		List<Accommodation> listAcc = accService.getAccByDestination((destService.getById(idDest)));
		modele.addAttribute("listAccDest", listAcc);
		
		return new ModelAndView("formulaHotel", "destination", destService.getById(idDest));

	}
	
}