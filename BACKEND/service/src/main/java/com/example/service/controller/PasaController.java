package com.example.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.facts.Dan;
import com.example.model.facts.Ocena;
import com.example.service.service.PasaService;

@RestController
@RequestMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
public class PasaController {
	
	@Autowired
	private PasaService ps;
	
	@GetMapping("/pasa/{id}")
    public Ocena orderNow(@PathVariable Long id) {
        return ps.executeRule(id);
    }
	
}
