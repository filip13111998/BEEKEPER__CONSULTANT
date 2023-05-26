package com.example.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.facts.Dan;
import com.example.model.facts.Ocena;
import com.example.service.dto.request.PasaFormDTO;
import com.example.service.dto.response.IstorijaDTO;
import com.example.service.dto.response.PasaDTO;
import com.example.service.service.PasaService;

@RestController
@RequestMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
public class PasaController {
	
	@Autowired
	private PasaService ps;
	
//	@GetMapping("/pasa/{id}")
//    public Ocena orderNow(@PathVariable Long id) {
//        return ps.executeRule(id);
//    }
	
	@GetMapping("/pasa/{id}")
    public ResponseEntity<Ocena> calculate(@PathVariable Long id) {
        return ResponseEntity.ok(ps.calculate(id));
    }
	
	@GetMapping("/pasa/all")
    public ResponseEntity<List<PasaDTO>> getAll() {
        return ResponseEntity.ok(ps.getAll());
    }
	
	@PostMapping("/pasa/istorija")
    public ResponseEntity<IstorijaDTO> pasaIstorija(@RequestBody PasaFormDTO pfdto) {
		String answer = ps.pasaIstorija(pfdto);
        return ResponseEntity.ok(new IstorijaDTO(answer));
    }
	
}
