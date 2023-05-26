package com.example.service.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.facts.Dan;
import com.example.model.facts.Ocena;
import com.example.service.config.DroolConfig;
import com.example.service.repository.DanRepository;
import com.example.service.template.KieSessionsTemplates;
import com.example.service.template.NadmorskaVisinaTemplate;

@Service
@Transactional
public class DanService {
	
	@Autowired
	private DanRepository dr;
	
//	@Autowired
//    private KieContainer kieContainer;
	
	public float getOcena(Dan dan) {
		KieContainer kieContainer = DroolConfig.createRuleBase();
		KieSession kieSession = kieContainer.newKieSession("k-session");
		
		kieSession.insert(dan);
        kieSession.fireAllRules();
        kieSession.dispose();
		
		return dan.getOcena();
	}

	public Ocena calculate(Dan dan) {
		
		KieSessionsTemplates.reset();
		
		//DAN
		KieSessionsTemplates.addDanJacinaVetraToSession();
		KieSessionsTemplates.addDanTemperaturaToSession();
		KieSessionsTemplates.addDanTipDanaToSession();
		KieSessionsTemplates.addDanVlaznostVazduhaToSession();
		KieSessionsTemplates.addFnishDanOcenaToSession();
		
		
		KieSession kieSession = KieSessionsTemplates.generateKieSession();

		kieSession.insert(dan);
        kieSession.fireAllRules();
        kieSession.dispose();
        
        for (FactHandle factHandle : kieSession.getFactHandles()) {
            Object fact = kieSession.getObject(factHandle);
            if (fact instanceof Ocena) {
                Ocena ocena = (Ocena) fact;
                if(ocena.getType().equals("FINISH_DAN_OCENA")) {
                	return ocena;
                }
            }
        }
				
		return null;
	}
	
}
