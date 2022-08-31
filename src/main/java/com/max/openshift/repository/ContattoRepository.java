package com.max.openshift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.max.openshift.model.Contatto;

@Repository("contattiRepository")
public interface ContattoRepository extends JpaRepository<Contatto, Long> {

}
