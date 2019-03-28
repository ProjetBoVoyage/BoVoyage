package fr.adaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.adaming.model.Admin;

@Controller
@RequestMapping("/insurance")
@Scope("session")

public class InsuranceController {

	// tranformation UML en JAVA
	@Autowired
	private IInsuranceService insuService;

	public String viewAdd(Model modele) {

	}

}
