package com.example.demoModulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class DemoModulithApplicationTests {

	@Test
	void createApplicationModuleMode(){
		ApplicationModules modules = ApplicationModules.of(DemoModulithApplication.class);
		modules.forEach(System.out::println);
	}

	@Test
	void verifiesModularStructure(){
		ApplicationModules modules = ApplicationModules.of(DemoModulithApplication.class);
		modules.verify();
	}

	@Test
	void createModuleDocumentation(){
		ApplicationModules modules = ApplicationModules.of(DemoModulithApplication.class);
		new Documenter(modules)
				.writeDocumentation()
				.writeIndividualModulesAsPlantUml();
	}

}
