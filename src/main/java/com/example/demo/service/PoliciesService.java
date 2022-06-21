package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Policies;

public interface PoliciesService {

    public List<Policies> findAll();
    
    public Policies findPolicy(String idPolicy);

}
