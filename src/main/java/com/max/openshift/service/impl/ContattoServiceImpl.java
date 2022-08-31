package com.max.openshift.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.max.openshift.model.Contatto;
import com.max.openshift.repository.ContattoRepository;
import com.max.openshift.service.ContattoService;

@Service("contattoService")
public class ContattoServiceImpl implements ContattoService {

	@Autowired
	private ContattoRepository cr;

	@Override
	public List<Contatto> getAll() {
		return cr.findAll();
	}

}
