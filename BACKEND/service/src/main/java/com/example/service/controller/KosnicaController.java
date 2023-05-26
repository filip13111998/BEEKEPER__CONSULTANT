package com.example.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.facts.Dan;
import com.example.model.facts.Kosnica;
import com.example.model.facts.Ocena;
import com.example.service.service.DanService;
import com.example.service.service.KosnicaService;

@RestController
@RequestMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
public class KosnicaController {
	
	
	@Autowired
	private KosnicaService ks;
	
	@PostMapping("/kosnica/ocena")
    public Ocena ocena(@RequestBody Kosnica kosnica) {
        
    	System.out.println(kosnica);
    	
    	return ks.calculate(kosnica);
//    	return null;
    }
	
	
}
