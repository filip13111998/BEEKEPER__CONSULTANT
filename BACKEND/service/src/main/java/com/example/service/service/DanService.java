package com.example.service.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.facts.Dan;
import com.example.service.config.DroolConfig;
import com.example.service.repository.DanRepository;

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
	
}
