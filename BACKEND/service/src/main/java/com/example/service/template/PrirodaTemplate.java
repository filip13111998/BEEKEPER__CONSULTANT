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

public class PrirodaTemplate {
	
	public static KieSession getKieHelper() {
		KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.newKieClasspathContainer();

        InputStream template = NadmorskaVisinaTemplate.class.getResourceAsStream("/drt/priroda.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"0" , "100", "0" , "2500" , "4500" , "10000","1"},
        	new String[] {"100" , "200", "2500" , "5000" , "3000" , "4500","2"},
        	new String[] {"200" , "300", "5000" , "10000" , "2000" , "3000","3"},
        	new String[] {"300" , "400", "10000" , "25000" , "1000" , "2000","4"},
        	new String[] {"400" , "500", "25000" , "100000" , "0" , "1000","5"},
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        String drl = compiler.compile(dataProvider, template);

        KieHelper kieHelper = new KieHelper();
        kieHelper.addContent(drl, ResourceType.DRL);
        	
        KieSession ksession = kieHelper.build().newKieSession();
        
        return ksession;
	}
	
}
