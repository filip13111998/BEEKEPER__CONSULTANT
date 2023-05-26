package com.example.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.facts.Dan;
import com.example.model.facts.NadmorskaVisina;
import com.example.model.facts.Ocena;
import com.example.service.service.NadmorskaVisinaService;

@RestController
@RequestMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
public class NadmorskaVisinaController {
	
	@Autowired
	private NadmorskaVisinaService nvs;
	
    @PostMapping("/nadmorska-visina")
    public NadmorskaVisina orderNow(@RequestBody NadmorskaVisina nv) {
        return nvs.setOcena(nv);
    }
    
    @PostMapping("/nadmorska-visina/ocena")
    public Ocena ocena(@RequestBody NadmorskaVisina nadmorskaVisina) {
        
    	System.out.println(nadmorskaVisina);
    	
    	return nvs.calculate(nadmorskaVisina);
    }
	
	
}
