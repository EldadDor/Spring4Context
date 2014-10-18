package com.spring.context.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by EAD-MASTER on 9/12/2014.
 */
public class TestConfigurationLoading {
	private final static Logger logger = LogManager.getLogger(TestConfigurationLoading.class.getName());

	@Test
	public void testConfigurationLoader() throws Exception {
		logger.info("testConfigurationLoader():");
		final ApplicationContext applicationContext = new ConfigurationLoader().loadGroovyContext();
		logger.info("testConfigurationLoader(): applicationContext=" + applicationContext);
		final Object grimlock = applicationContext.getBean("grimlock");
	}

	@Test
	public void testConfigurationBlend() throws Exception {
		final ConfigurationBlender blender = new ConfigurationBlender();
		final ApplicationContext context = blender.initializeXmlContext(new String[]{"spring/xml-context.xml"});
		logger.info("testConfigurationBlend():");

		final ApplicationContext groovyContext = blender.initializeGroovyContext(true, new ClassPathResource("spring/groovy-context.groovy"));
		logger.info("testConfigurationBlend():");
	/*	BeanBuilder builder = new BeanBuilder() ;
		builder.beans(  ) {
			dataSource(DataSource) {                  // <--- invokeMethod
				driverClassName = "org.h2.Driver"
				url = "jdbc:h2:mem:grailsDB"
				username = "sa"                            // <-- setProperty
				password = ""
				settings = [mynew:"setting"]
			}
*/
	}


}
