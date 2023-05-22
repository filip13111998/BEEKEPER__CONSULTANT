package com.example.service.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class DroolConfig {

//    @Bean
//    public KieServices kieServices() {
//        return KieServices.Factory.get();
//    }

//    @Bean
//    public KieContainer kieContainer() {
//        return KieServices.Factory.get().getKieClasspathContainer();
//    }
    

    public static KieContainer createRuleBase() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kieContainer = ks.getKieClasspathContainer();
        return kieContainer;
    }
//
//    public static StatelessKieSession getStatlessKnowledgeSession(KieContainer kieContainer, String sessionName) {
//        StatelessKieSession kSession = kieContainer.newStatelessKieSession(sessionName);
//        return kSession;
//    }
//
//    public static KieSession getStatefulKnowledgeSession(KieContainer kieContainer, String sessionName) {
//        KieSession kSession = kieContainer.newKieSession(sessionName);
//        return kSession;
//    }

}
