package com.example.service.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.facts.Ocena;
import com.example.model.facts.Pasa;
import com.example.service.config.DroolConfig;
import com.example.service.dto.request.PasaFormDTO;
import com.example.service.dto.response.PasaDTO;
import com.example.service.repository.PasaRepository;
import com.example.service.template.KieSessionsTemplates;

@Service
@Transactional
public class PasaService {
	
	@Autowired
	private PasaRepository pr;
	
	public Ocena executeRule(Long id) {
		
		KieContainer kieContainer = DroolConfig.createRuleBase();
		KieSession kieSession = kieContainer.newKieSession("pasa-session");
		
		Optional<Pasa> pasa = pr.findById(id);
		if(pasa.isPresent()) {
			kieSession.insert(pasa.get());
			long ruleFireCount = kieSession.fireAllRules();
			System.out.println("RULES NUMBER:" + ruleFireCount);
	        kieSession.dispose();
	        
	        for (FactHandle factHandle : kieSession.getFactHandles()) {
	            Object fact = kieSession.getObject(factHandle);
	            if (fact instanceof Ocena) {
	                Ocena ocena = (Ocena) fact;
	                if(ocena.getType().equals("PRIRODA_NADMORSKA_VISINA_KOSNICE_PROGNOZA")) {
	                	return ocena;
	                }
	                // Perform attribute modification
	                //specialFact.setSomeAttribute(newValue); // Modify the attribute value as needed
//	                kieSession.update(kieSession.getFactHandle(specialFact), specialFact);
	                
	            }
	        }
		}
		
		return null;
		
	}

	public Ocena calculate(Long id) {
		// TODO Auto-generated method stub
		
		KieSessionsTemplates.reset();
		
		//DAN
		KieSessionsTemplates.addDanJacinaVetraToSession();
		KieSessionsTemplates.addDanTemperaturaToSession();
		KieSessionsTemplates.addDanTipDanaToSession();
		KieSessionsTemplates.addDanVlaznostVazduhaToSession();
		KieSessionsTemplates.addFnishDanOcenaToSession();
		
		//KOSNICE
		KieSessionsTemplates.addKosnicaBrojRamovaLeglaToSession();
		KieSessionsTemplates.addKosnicaBrojRamovaMedaToSession();
		KieSessionsTemplates.addKosnicaBrojRamovaPcelaToSession();
		KieSessionsTemplates.addKosnicaBrojRamovaPolenaToSession();
		KieSessionsTemplates.addFnishKosnicaOcenaToSession();
		
		//NADMORSKA VISINA
		KieSessionsTemplates.addNadmorskaVisinaNadmorskaVisinaToSession();
		KieSessionsTemplates.addNadmorskaVisinaPolozajTerenaToSession();
		KieSessionsTemplates.addFnishNadmorskaVisinaOcenaToSession();
		
		//PRIRODA
		KieSessionsTemplates.addPrirodaBrojBiljakaToSession();
		KieSessionsTemplates.addPrirodaTeritorijalnaRasprostranjenostToSession();
		KieSessionsTemplates.addPrirodaUdaljenostRekeToSession();
		KieSessionsTemplates.addPrirodaBonusOcenaToSession();
		KieSessionsTemplates.addFnishPrirodaOcenaToSession();
		
		//PASA
		KieSessionsTemplates.addPasaOcenaToSession();
		
		KieSession kieSession = KieSessionsTemplates.generateKieSession();

        
		
		Optional<Pasa> pasa = pr.findById(id);
		if(pasa.isPresent()) {
			System.out.println(pasa.get());
			kieSession.insert(pasa.get().getNadmorksa_visina());
			kieSession.insert(pasa.get().getPriroda());
			
			pasa.get().getKosnice().forEach(k->kieSession.insert(k));
			pasa.get().getVremenska_prognoza().forEach(d->kieSession.insert(d));
			
			long ruleFireCount = kieSession.fireAllRules();
			System.out.println("RULES NUMBER:" + ruleFireCount);
	        kieSession.dispose();
	        
	        for (FactHandle factHandle : kieSession.getFactHandles()) {
	            Object fact = kieSession.getObject(factHandle);
	            if (fact instanceof Ocena) {
	                Ocena ocena = (Ocena) fact;
	                if(ocena.getType().equals("PASA_OCENA")) {
	                	return ocena;
	                }
//	                if(ocena.getType().contains("FINISH")) {
//	                	return ocena;
//	                }
	                // Perform attribute modification
	                //specialFact.setSomeAttribute(newValue); // Modify the attribute value as needed
//	                kieSession.update(kieSession.getFactHandle(specialFact), specialFact);
	                
	            }
	        }
		}
		
		return null;
	}

	public List<PasaDTO> getAll() {
		List<PasaDTO> pase = pr.findAll().stream()
				.map(p->new PasaDTO(p.getId(),p.getTip_pase() , p.getGodina()))
				.collect(Collectors.toList());
		// TODO Auto-generated method stub
		return pase;
	}

	public String pasaIstorija(PasaFormDTO pfdto) {


		KieSessionsTemplates.reset();
		
		//DAN
		KieSessionsTemplates.addPasaIstorijaToSession();

		KieSession kieSession = KieSessionsTemplates.generateKieSession();

		
		List<Pasa> pase = pr.findAll();
		
		kieSession.setGlobal("years", pfdto.getGodina());
		kieSession.setGlobal("type", pfdto.getTip());
		kieSession.setGlobal("counter", 0);
		pase.stream().forEach(p->kieSession.insert(p));
		kieSession.fireAllRules();
		kieSession.dispose();
		
		 for (FactHandle factHandle : kieSession.getFactHandles()) {
	            Object fact = kieSession.getObject(factHandle);
	            if (fact instanceof Ocena) {
	                Ocena ocena = (Ocena) fact;
	                if(ocena.getType().contains("YES")) {
	                	return "PROJEKCIJA JE DA CE PASA BITI LOSA";
	                }
	                if(ocena.getType().contains("NO")) {
	                	return "PROJEKCIJA JE DA CE PASA BITI DOBRA";
	                }

	            }
	        }
		
		return "REZ";
	}


	
}
