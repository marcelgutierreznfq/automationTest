package com.example.demo.dao;
import java.util.List;

import com.example.demo.entity.Policies;

public interface PoliciesDAO {

	public List<Policies> findAll();
	
	public Policies findPolicy(String idPolicy);

	
}
