package com.example.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.facts.Dan;
import com.example.model.facts.Ocena;
import com.example.service.service.DanService;

@RestController
@RequestMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
public class DanController {
	
	@Autowired
	private DanService ds;
	
    @PostMapping("/dan")
    public float orderNow(@RequestBody Dan dan) {
        return ds.getOcena(dan);
    }
    
    @PostMapping("/dan/ocena")
    public ResponseEntity<Ocena> ocena(@RequestBody Dan dan) {
        
    	System.out.println(dan);
    	
    	return ResponseEntity.ok(ds.calculate(dan));
//    	return null;
    }
	
}
