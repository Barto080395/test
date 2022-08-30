package com.max.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	
	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario","Rossi","mario"));
		lista.add(new Contatto("Paola","Verdi","paola"));
		lista.add(new Contatto("Franco","Neri","franco"));
		lista.add(new Contatto("Anna","Grigi","anna"));
		lista.add(new Contatto("Massimo","Blu","massimo"));
		return lista;
	}
}
