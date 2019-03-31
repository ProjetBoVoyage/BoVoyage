package fr.adaming.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.adaming.model.Destination;
import fr.adaming.service.IDestinationService;

@Controller
@RequestMapping("/start")
public class StartController {
	
	// Transformation de l'asso UML en JAVA
	@Autowired
	private IDestinationService destService;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String displayWelcomePage(Model modele) {
		modele.addAttribute("listDest",destService.getAll());
		return "homePage";
	}

	@RequestMapping(value = "/custo/customerPage", method = RequestMethod.GET)
	public String displayCustomerSpacePage() {
		return "customerPage";
	}

	@RequestMapping(value = "/admin/adminPage", method = RequestMethod.GET)
	public String displayAdminSpacePage() {
		return "adminPage";
	}

	@RequestMapping(value = "/couns/counsellorPage", method = RequestMethod.GET)
	public String displayCounsellorSpacePage() {
		return "counsellorPage";
	}
	
	/** METHODE AFFICHER PHOTO */
	@RequestMapping(value = "/photoDest", produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public byte[] getPhoto(int idDest) throws IOException {
		Destination dOut = destService.getById(idDest);
		if (dOut.getPhoto() == null) {
			return new byte[0];
		} else {
			return IOUtils.toByteArray(new ByteArrayInputStream(dOut.getPhoto()));
		}
	}
}
