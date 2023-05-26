package com.example.service.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.facts.Dan;
import com.example.model.facts.NadmorskaVisina;
import com.example.model.facts.Ocena;
import com.example.model.facts.Priroda;
import com.example.service.config.DroolConfig;
import com.example.service.repository.DanRepository;
import com.example.service.template.KieSessionsTemplates;
import com.example.service.template.NadmorskaVisinaTemplate;
import com.example.service.template.PrirodaTemplate;

@Service
@Transactional
public class PrirodaService {


	public Ocena setOcena(Priroda priroda) {
		
		KieSession kieSession = PrirodaTemplate.getKieHelper();
		
		kieSession.insert(priroda);
		
        kieSession.fireAllRules();
        
        kieSession.dispose();
        
        for (FactHandle factHandle : kieSession.getFactHandles()) {
            Object fact = kieSession.getObject(factHandle);
            if (fact instanceof Ocena) {
                Ocena ocena = (Ocena) fact;
                if(ocena.getType().equals("PRIRODA_OCENA")) {
                	priroda.setOcena(ocena.getOcena());
                	return ocena;
                }
                // Perform attribute modification
                //specialFact.setSomeAttribute(newValue); // Modify the attribute value as needed
//                kieSession.update(kieSession.getFactHandle(specialFact), specialFact);
                
            }
        }

		return null;
	}

	public Ocena calculate(Priroda priroda) {
		
		KieSessionsTemplates.reset();
		
		KieSessionsTemplates.addPrirodaBrojBiljakaToSession();
		KieSessionsTemplates.addPrirodaTeritorijalnaRasprostranjenostToSession();
		KieSessionsTemplates.addPrirodaUdaljenostRekeToSession();
		KieSessionsTemplates.addPrirodaBonusOcenaToSession();
		KieSessionsTemplates.addFnishPrirodaOcenaToSession();
		
		KieSession kieSession = KieSessionsTemplates.generateKieSession();

		kieSession.insert(priroda);
        kieSession.fireAllRules();
        kieSession.dispose();
        
        for (FactHandle factHandle : kieSession.getFactHandles()) {
            Object fact = kieSession.getObject(factHandle);
            if (fact instanceof Ocena) {
                Ocena ocena = (Ocena) fact;
                if(ocena.getType().equals("FINISH_PRIRODA_OCENA")) {
                	return ocena;
                }
            }
        }
				
		return null;
	}
	
}
