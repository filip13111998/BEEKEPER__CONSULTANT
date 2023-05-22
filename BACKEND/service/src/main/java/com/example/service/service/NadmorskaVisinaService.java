package com.example.service.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.utils.KieHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.facts.NadmorskaVisina;
import com.example.service.config.DroolConfig;
import com.example.service.template.NadmorskaVisinaTemplate;

@Service
@Transactional
public class NadmorskaVisinaService {
	
	public NadmorskaVisina setOcena(NadmorskaVisina nv) {
		System.out.println("NV START");
		KieSession kieSession = NadmorskaVisinaTemplate.getKieHelper();
		System.out.println("NV MID");
		kieSession.insert(nv);
        kieSession.fireAllRules();
        kieSession.dispose();
        System.out.println("NV END");
				
		return nv;
	}
	
}
