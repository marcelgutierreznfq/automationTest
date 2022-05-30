package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PoliciesDAO;
import com.example.demo.entity.Policies;

@Service
public class PoliciesServiceImpl implements PoliciesService{

	@Autowired
	private PoliciesDAO policyDAO;
	
	
	@Override
	public List<Policies> findAll() {
        List<Policies> listUsers= policyDAO.findAll();
        return listUsers;
	}


	@Override
	public Policies findPolicy(String idPolicy) {
		Policies policy= policyDAO.findPolicy(idPolicy);
        return policy;
	}

}
