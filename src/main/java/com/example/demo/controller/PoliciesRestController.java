package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Policies;
import com.example.demo.service.PoliciesService;

@RestController
@RequestMapping("/api")
public class PoliciesRestController {
	
    @Autowired
    private PoliciesService policyService;
	

	@GetMapping("/policies")
    public List<Policies> findAll(){
        return policyService.findAll();
    }
	
	@GetMapping("/policies/{policy}")
    public Policies findPolicy(@PathVariable String policy){
		Policies pol=policyService.findPolicy(policy);
	    if(pol==null) {
		    throw new RuntimeException("Policy id not found -"+policy);
	    }
        return pol;
    }
	
}
