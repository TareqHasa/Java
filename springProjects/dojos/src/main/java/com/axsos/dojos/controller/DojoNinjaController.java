package com.axsos.dojos.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.dojos.models.Dojo;
import com.axsos.dojos.models.Ninja;
import com.axsos.dojos.services.DojoService;
import com.axsos.dojos.services.NinjaService;

@Controller
public class DojoNinjaController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	
	public DojoNinjaController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	@RequestMapping("/dojos/new")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "dojos/dojo.jsp";
	}
	@RequestMapping(value = "/dojos/new" ,method = RequestMethod.POST)
	public String createNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo,BindingResult result ) {
		if (result.hasErrors()) {
			return "dojos/dojo.jsp";
		}
		dojoService.createDojo(dojo);
		return "redirect:/dojos/new";
	}
	@RequestMapping("/ninjas/new")
	public String createNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja,BindingResult result,Model model) {
		model.addAttribute("dojos",dojoService.findAllDojo());
		return "ninjas/ninja.jsp";
	}
	@PostMapping("/ninja/new")
	public String createNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja,BindingResult result) {
		if (result.hasErrors()) {
			return "ninjas/ninja.jsp";
		}
		ninjaService.createNinja(ninja);
		return "redirect:/ninjas/new";
	}
	@RequestMapping("/dojos/{id}")
	public String ShowDojo(@PathVariable("id") Long id,Model model) {
		model.addAttribute("dojo",dojoService.getDojoById(id));
		return "dojos/show.jsp";
	}
}
