package com.example.service.template;

import java.io.InputStream;
import java.nio.file.Paths;

import org.drools.template.DataProvider;
import org.drools.template.DataProviderCompiler;
import org.drools.template.objects.ArrayDataProvider;
import org.kie.api.io.Resource;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

public class KieSessionsTemplates {
		
	private static KieHelper kieHelper;
	
	public static void reset() {
		kieHelper = new KieHelper();
	}
	
	
	//DAN_JACINA_VETRA_OCENA
	public static void addDanJacinaVetraToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/dan_jacina_vetra.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"1","30","5"},
        	new String[] {"30","60","4"},
        	new String[] {"60","90","3"},
        	new String[] {"90","200","2"},
        	new String[] {"200","500","1"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//DAN_TEMPERATURA_OCENA
	public static void addDanTemperaturaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/dan_temperatura.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"1","17","1"},
        	new String[] {"17","22","2"},
        	new String[] {"22","27","3"},
        	new String[] {"27","32","5"},
        	new String[] {"32","50","2"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//DAN_TEMPERATURA_OCENA
	public static void addDanTipDanaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/dan_tip_dana.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"SUNCE","5"},
        	new String[] {"OBLAK","4"},
        	new String[] {"MAGLA","3"},
        	new String[] {"KISA","2"},
        	new String[] {"SNEG","1"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//DAN_TEMPERATURA_OCENA
	public static void addDanVlaznostVazduhaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/dan_vlaznost_vazduha.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"1","200","5"},
        	new String[] {"200","400","4"},
        	new String[] {"400","600","3"},
        	new String[] {"600","800","2"},
        	new String[] {"800","1000","1"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}

	//FINISH_DAN_OCENA
	public static void addFnishDanOcenaToSession() {
		
//		String path = Paths.get("").normalize().toAbsolutePath().toString();
//	    String drlFilePath = path.split("service")[0] + "kjar\\src\\main\\resources\\drl\\dan_ocena.drl";
		String drlFilePath = "C:/Users/vaske/Desktop/SBNZ-BEE-CONSULTANT/BACKEND/kjar/src/main/resources/drl/dan_ocena.drl";
	    
//	    Resource drlResource = ResourceFactory.newClassPathResource(drlFilePath);
		Resource drlResource = ResourceFactory.newFileResource(drlFilePath);

		
	    if (drlResource != null) {
	        kieHelper.addResource(drlResource, ResourceType.DRL);
	    } else {
	        // Handle the case when the DRL file is not found
	        System.out.println("Unable to load DRL file: " + drlFilePath);
	    }

	}
	
	
	//KOSNICA_BROJ_RAMOVA_LEGLA
	public static void addKosnicaBrojRamovaLeglaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/kosnica_broj_ramova_legla.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"1","3","1"},
        	new String[] {"3","5","2"},
        	new String[] {"5","7","3"},
        	new String[] {"7","9","4"},
        	new String[] {"9","11","5"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//KOSNICA_BROJ_RAMOVA_MEDA
	public static void addKosnicaBrojRamovaMedaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/kosnica_broj_ramova_meda.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"1","3","1"},
        	new String[] {"3","5","2"},
        	new String[] {"5","7","3"},
        	new String[] {"7","9","4"},
        	new String[] {"9","11","5"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//KOSNICA_BROJ_RAMOVA_PCELA
	public static void addKosnicaBrojRamovaPcelaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/kosnica_broj_ramova_pcela.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"1","3","1"},
        	new String[] {"3","5","2"},
        	new String[] {"5","7","3"},
        	new String[] {"7","9","4"},
        	new String[] {"9","11","5"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//KOSNICA_BROJ_RAMOVA_POLENA
	public static void addKosnicaBrojRamovaPolenaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/kosnica_broj_ramova_polena.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"1","3","1"},
        	new String[] {"3","5","2"},
        	new String[] {"5","7","3"},
        	new String[] {"7","9","4"},
        	new String[] {"9","11","5"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//FINISH_DAN_OCENA
	public static void addFnishKosnicaOcenaToSession() {
		
		String path = Paths.get("").normalize().toAbsolutePath().toString();
	    
		String drlFilePath = path.split("service")[0] + "kjar\\src\\main\\resources\\drl\\kosnica_ocena.drl";

	    Resource drlResource = ResourceFactory.newFileResource(drlFilePath);

		
	    if (drlResource != null) {
	        kieHelper.addResource(drlResource, ResourceType.DRL);
	    } else {
	        // Handle the case when the DRL file is not found
	        System.out.println("Unable to load DRL file: " + drlFilePath);
	    }

	}
	
	
	//NADMORKSA_VISINA_NADMORSKA_VISINA_OCENA
	public static void addNadmorskaVisinaNadmorskaVisinaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/nadmorska_visina_nadmorska_visina.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"1","300","5"},
        	new String[] {"300","600","4"},
        	new String[] {"600","1000","3"},
        	new String[] {"1000","2500","2"},
        	new String[] {"2500","5000","1"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//NADMORKSA_VISINA_POLOZAJ_TERENA_OCENA
	public static void addNadmorskaVisinaPolozajTerenaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/nadmorska_visina_polozaj_terena.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"RAVNO","5"},
        	new String[] {"BRDO","4"},
        	new String[] {"DOLINA","3"}
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//FINISH_NADMORSKA_VISINA_OCENA
	public static void addFnishNadmorskaVisinaOcenaToSession() {
		
		String path = Paths.get("").normalize().toAbsolutePath().toString();
	    
		String drlFilePath = path.split("service")[0] + "kjar\\src\\main\\resources\\drl\\nadmorska_visina_ocena.drl";

	    Resource drlResource = ResourceFactory.newFileResource(drlFilePath);

		
	    if (drlResource != null) {
	        kieHelper.addResource(drlResource, ResourceType.DRL);
	    } else {
	        // Handle the case when the DRL file is not found
	        System.out.println("Unable to load DRL file: " + drlFilePath);
	    }

	}
	
	
	//PRIRODA_BROJ_BILJAKA_OCENA
	public static void addPrirodaBrojBiljakaToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/priroda_broj_biljaka.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"20","30","5"},
        	new String[] {"15","20","4"},
        	new String[] {"10","15","3"},
        	new String[] {"5","10","2"},
        	new String[] {"1","5","1"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//PRIRODA_TERITORIJALNA_RASPROSTRANJENOST_OCENA
	public static void addPrirodaTeritorijalnaRasprostranjenostToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/priroda_teritorijalna_rasprostranjenost.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"4000","6000","5"},
        	new String[] {"3000","4000","4"},
        	new String[] {"2000","3000","3"},
        	new String[] {"1000","2000","2"},
        	new String[] {"1","1000","1"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//PRIRODA_UDALJENOST_REKE_OCENA
	public static void addPrirodaUdaljenostRekeToSession() {

        InputStream template = KieSessionsTemplates.class.getResourceAsStream("/drt/priroda_udaljenost_reke.drt");

        DataProvider dataProvider = new ArrayDataProvider(new String[][] {
        	new String[] {"1","300","5"},
        	new String[] {"300","600","4"},
        	new String[] {"600","1000","3"},
        	new String[] {"1000","2500","2"},
        	new String[] {"2500","5000","1"},
        	
        });

        DataProviderCompiler compiler = new DataProviderCompiler();
        
        String drl = compiler.compile(dataProvider, template);

        
        kieHelper.addContent(drl, ResourceType.DRL);
        
	}
	
	//PRIRODA_BONUS_OCENA
	public static void addPrirodaBonusOcenaToSession() {
		
		String path = Paths.get("").normalize().toAbsolutePath().toString();
	    
		String drlFilePath = path.split("service")[0] + "kjar\\src\\main\\resources\\drl\\priroda_bonus.drl";

	    Resource drlResource = ResourceFactory.newFileResource(drlFilePath);

		
	    if (drlResource != null) {
	        kieHelper.addResource(drlResource, ResourceType.DRL);
	    } else {
	        // Handle the case when the DRL file is not found
	        System.out.println("Unable to load DRL file: " + drlFilePath);
	    }

	}
	
	
	//FINISH_PRIRODA_OCENA
	public static void addFnishPrirodaOcenaToSession() {
		
		String path = Paths.get("").normalize().toAbsolutePath().toString();
	    
		String drlFilePath = path.split("service")[0] + "kjar\\src\\main\\resources\\drl\\priroda_ocena.drl";

	    Resource drlResource = ResourceFactory.newFileResource(drlFilePath);

		
	    if (drlResource != null) {
	        kieHelper.addResource(drlResource, ResourceType.DRL);
	    } else {
	        // Handle the case when the DRL file is not found
	        System.out.println("Unable to load DRL file: " + drlFilePath);
	    }

	}
	
	//PASA_OCENA
	public static void addPasaOcenaToSession() {
		
		String path = Paths.get("").normalize().toAbsolutePath().toString();
	    
		String drlFilePath = path.split("service")[0] + "kjar\\src\\main\\resources\\drl\\pasa_ocena.drl";

	    Resource drlResource = ResourceFactory.newFileResource(drlFilePath);

		
	    if (drlResource != null) {
	        kieHelper.addResource(drlResource, ResourceType.DRL);
	    } else {
	        // Handle the case when the DRL file is not found
	        System.out.println("Unable to load DRL file: " + drlFilePath);
	    }

	}
	
	//PASA_ISTORIJA
	public static void addPasaIstorijaToSession() {

		String path = Paths.get("").normalize().toAbsolutePath().toString();
	    
		String drlFilePath = path.split("service")[0] + "kjar\\src\\main\\resources\\drl\\pasa_istorija.drl";

	    Resource drlResource = ResourceFactory.newFileResource(drlFilePath);

		
	    if (drlResource != null) {
	        kieHelper.addResource(drlResource, ResourceType.DRL);
	    } else {
	        // Handle the case when the DRL file is not found
	        System.out.println("Unable to load DRL file: " + drlFilePath);
	    }
        
	}
	
	
	//GENERATE NEW KIE SESSION
	public static KieSession generateKieSession() {
		
		KieSession ksession = kieHelper.build().newKieSession();
        
        return ksession;
	}
	
}	
