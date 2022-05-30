package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Divisas;
import com.example.demo.repository.DivisasRepository;

@Service
public class DivisasService {

    @Autowired
    private DivisasRepository divisasRepository;
    
    public List<Divisas> getDivisas() {
		return divisasRepository.spTestAPI();
	}
    
    public Divisas getDivisas(String divisa) {
		return divisasRepository.spTestAPI(divisa);
	}
}
