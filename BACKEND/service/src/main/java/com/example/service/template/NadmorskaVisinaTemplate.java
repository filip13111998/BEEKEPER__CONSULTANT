package com.example.service.template;

import java.io.InputStream;

import org.drools.template.DataProvider;
import org.drools.template.DataProviderCompiler;
import org.drools.template.objects.ArrayDataProvider;
import org.kie.api.KieServices;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.utils.KieHelper;

public class NadmorskaVisinaTemplate {
	
	public static KieSession getKieHelper() {
//		KieServices ks = KieServices.Factory.get();
//        KieContainer kc = ks.newKieClasspathContainer();

        InputStream template = NadmorskaVisinaTemplate.class.getResourceAsStream("/drt/nadmorskavisina.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"800","1100","RAVNO","5"},
        	new String[] {"1100","1400","RAVNO","4"},
        	new String[] {"1400","1700","RAVNO","3"},
        	new String[] {"800","1100","BRDO","4"},
        	new String[] {"1100","1400","BRDO","3"},
        	new String[] {"1400","1700","BRDO","2"},
        	new String[] {"800","1100","DOLINA","3"},
        	new String[] {"1100","1400","DOLINA","2"},
        	new String[] {"1400","1700","DOLINA","1"}
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        String drl = compiler.compile(dataProvider, template);

        KieHelper kieHelper = new KieHelper();
        kieHelper.addContent(drl, ResourceType.DRL);
        
        	
        KieSession ksession = kieHelper.build().newKieSession();
        
        return ksession;
	}
	
}
