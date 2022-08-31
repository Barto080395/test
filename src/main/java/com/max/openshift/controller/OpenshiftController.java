package com.max.openshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.max.openshift.model.Contatto;
import com.max.openshift.service.ContattoService;

@Controller
public class OpenshiftController {
	@Autowired
	private ContattoService cr;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homnePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		List<Contatto> listaContatti = cr.getAll();
		mv.addObject(listaContatti);
		return mv;
	}
}
