package com.example.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.facts.Dan;
import com.example.model.facts.NadmorskaVisina;
import com.example.model.facts.Ocena;
import com.example.model.facts.Priroda;
import com.example.service.service.NadmorskaVisinaService;
import com.example.service.service.PrirodaService;

@RestController
@RequestMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
public class PrirodaController {
	
	@Autowired
	private PrirodaService ps;
	
    @PostMapping("/priroda")
    public Ocena orderNow(@RequestBody Priroda priroda) {
        return ps.setOcena(priroda);
    }

    @PostMapping("/priroda/ocena")
    public Ocena ocena(@RequestBody Priroda priroda) {
        
    	System.out.println(priroda);
    	
    	return ps.calculate(priroda);
    }

}
