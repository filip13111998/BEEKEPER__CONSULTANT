package com.example.service.service;

import java.util.Optional;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.facts.Ocena;
import com.example.model.facts.Pasa;
import com.example.service.config.DroolConfig;
import com.example.service.repository.PasaRepository;

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
	
}
