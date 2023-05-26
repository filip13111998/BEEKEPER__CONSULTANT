package com.example.service.service;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.facts.Dan;
import com.example.model.facts.Kosnica;
import com.example.model.facts.Ocena;
import com.example.service.template.KieSessionsTemplates;

@Service
@Transactional
public class KosnicaService {
	
	
	public Ocena calculate(Kosnica kosnica) {
		
		KieSessionsTemplates.reset();
		
		KieSessionsTemplates.addKosnicaBrojRamovaLeglaToSession();
		KieSessionsTemplates.addKosnicaBrojRamovaMedaToSession();
		KieSessionsTemplates.addKosnicaBrojRamovaPcelaToSession();
		KieSessionsTemplates.addKosnicaBrojRamovaPolenaToSession();
		KieSessionsTemplates.addFnishKosnicaOcenaToSession();
		
		KieSession kieSession = KieSessionsTemplates.generateKieSession();

		kieSession.insert(kosnica);
        kieSession.fireAllRules();
        kieSession.dispose();
        
        for (FactHandle factHandle : kieSession.getFactHandles()) {
            Object fact = kieSession.getObject(factHandle);
            if (fact instanceof Ocena) {
                Ocena ocena = (Ocena) fact;
                if(ocena.getType().equals("FINISH_KOSNICA_OCENA")) {
                	return ocena;
                }
            }
        }
				
		return null;
	}
	
}
