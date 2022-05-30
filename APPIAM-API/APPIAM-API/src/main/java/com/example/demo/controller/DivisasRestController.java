package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Divisas;
import com.example.demo.service.DivisasService;

@RestController
public class DivisasRestController {

    @Autowired
    private DivisasService divisasService;
    
    @GetMapping("/divisas")
    @Transactional(readOnly = true)
    public List<Divisas> getDivisas() {
        return divisasService.getDivisas();
    }
        
    @GetMapping("/divisas/{isocode}")
    @Transactional(readOnly = true)
    public Divisas getDivisa(@PathVariable String isocode) {
        return divisasService.getDivisas(isocode);
    }
    
    
}
