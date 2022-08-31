package com.max.openshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max.openshift.model.Contatto;
import com.max.openshift.service.ContattoService;

@RestController
@RequestMapping("/api")
public class ServiceRestController {
	@Autowired
	private ContattoService cr;
	
	@RequestMapping("/contatti")
	public List<Contatto> serviceTest() {
		return cr.getAll();
	}
}
