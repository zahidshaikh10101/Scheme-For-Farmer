package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Insurance;

@Repository
public class InsuranceDaoImpl implements InsuranceDao{
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Insurance findById(int id) {
		return em.find(Insurance.class,id);
	}

}
