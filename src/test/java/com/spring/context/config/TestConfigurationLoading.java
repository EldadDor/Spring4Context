package com.spring.context.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

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
}
