package fr.adaming.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fr.adaming.model.Accommodation;
import fr.adaming.model.Cart;
import fr.adaming.model.Flight;
import fr.adaming.model.FormulaAccomodation;
import fr.adaming.model.FormulaTrip;
import fr.adaming.model.Insurance;
import fr.adaming.model.Trip;
import fr.adaming.service.IAccommodationService;
import fr.adaming.service.IDestinationService;
import fr.adaming.service.IFlightService;
import fr.adaming.service.IFormulaAccommodationService;
import fr.adaming.service.IFormulaTripService;
import fr.adaming.service.IInsuranceService;
import fr.adaming.service.ITripService;

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
	@Autowired
	private IFormulaTripService ftService;
	@Autowired
	private IFormulaAccommodationService faService;
	@Autowired
	private IInsuranceService iService;
	@Autowired
	private ITripService tripService;

	private Accommodation accOut;
	private Cart cart;
	
	@PostConstruct
	public void init() {

		this.cart = new Cart();
	}

	public Accommodation getAccOut() {
		return accOut;
	}

	public void setAccOut(Accommodation accOut) {
		this.accOut = accOut;
	}

	/** FORMULE VOL SEUL */
	@RequestMapping(value = "/viewFlight", method = RequestMethod.GET)
	public ModelAndView viewFlightForm(@RequestParam("pDest") @ModelAttribute("destSearch") int idDest, Model modele) {

		List<Flight> listFli = fliService.getFliByDestination(destService.getById(idDest));
		modele.addAttribute("listFliDest", listFli);
		
		return new ModelAndView("formulaFlight", "destination", destService.getById(idDest));

	}

	/** FORMULE HOTEL SEUL */
	@RequestMapping(value = "/viewHotel", method = RequestMethod.GET)
	public ModelAndView viewHotelForm(@RequestParam("pDest") @ModelAttribute("destSearch") int idDest, Model modele) {

		List<Accommodation> listAcc = accService.getAccByDestination((destService.getById(idDest)));
		modele.addAttribute("listAccDest", listAcc);

		return new ModelAndView("formulaHotel", "destination", destService.getById(idDest));

	}

	@RequestMapping(value = "/selectHotel", method = RequestMethod.GET)
	public ModelAndView selectHotelForm(HttpServletRequest request,
			@RequestParam("pAcc") @ModelAttribute("accSelect") int idAcc, Model modele) {

		List<FormulaAccomodation> formacc = faService.getAll();
		modele.addAttribute("formacc", formacc);
		List<Insurance> forminsu = iService.getAll();
		modele.addAttribute("forminsu", forminsu);
		modele.addAttribute(new FormulaTrip());
		modele.addAttribute(new FormulaAccomodation());

		return new ModelAndView("hotelReservationPage", "hotel", accService.getById(idAcc));

	}

	@RequestMapping(value = "/submitResHotel", method = RequestMethod.POST)
	public ModelAndView submitResHotel(Model modele, @ModelAttribute("formulaTrip") FormulaTrip formTrip) {

		// FormulaTrip formTrip = new FormulaTrip();
		formTrip.setNameFormTrip("Formule Hôtel Seul");
		formTrip.setRate(0.9);
		// Appel de la méthode service

		int test = ftService.add(formTrip);
		
		if (test != 0) {
			try {
				List<Trip> listTrips = this.cart.getTrips();
				Trip trip = new Trip();
				trip.setFormulaTrip(formTrip);
				listTrips.add(trip);
				this.cart.setTrips(listTrips);
				tripService.add(trip);
			} catch (Exception e1) {
				List<Trip> listTrips = new ArrayList<Trip>();
				Trip trip = new Trip();
				trip.setFormulaTrip(formTrip);
				listTrips.add(trip);
				System.out.println(listTrips + " "+ cart);
				this.cart.setTrips(listTrips);
				tripService.add(trip);
			}
			System.out.println(cart);
			return new ModelAndView("cartPage","msg","this trip has been added to your Cart !");
		} else {
			return  new ModelAndView("hotelReservationPage","msg","Something went wrong");
		}

	}

	/** FORMULE HOTEL + VOL */
	@RequestMapping(value = "/viewHotFli", method = RequestMethod.GET)
	public ModelAndView viewHotFliForm(@RequestParam("pDest") @ModelAttribute("destSearch") int idDest, Model modele) {

		List<Accommodation> listAcc = accService.getAccByDestination((destService.getById(idDest)));
		modele.addAttribute("listAccDest", listAcc);

		List<Flight> listFli = fliService.getFliByDestination(destService.getById(idDest));
		modele.addAttribute("listFliDest", listFli);

		return new ModelAndView("formulaHotFli", "destination", destService.getById(idDest));

	}

	/** METHODE AFFICHER PHOTO */
	@RequestMapping(value = "/photoAcc", produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] getPhoto(int idAcc) throws IOException {
		Accommodation acOut = accService.getById(idAcc);
		if (acOut.getPhoto() == null) {
			return new byte[0];
		} else {
			return IOUtils.toByteArray(new ByteArrayInputStream(acOut.getPhoto()));
		}
	}

}