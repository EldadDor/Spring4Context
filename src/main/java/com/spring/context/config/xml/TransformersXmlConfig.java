/*
 * User: eldad.Dor
 * Date: 07/09/2014 13:09
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.spring.context.config.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;

/**
 * @author eldad
 * @date 07/09/2014
 */
@Configuration
public class TransformersXmlConfig {

	@Bean
	Initializer initializer() {
		return new Initializer();
	}

	private static class Initializer {

		@Autowired
		private ApplicationContext context;

		@PostConstruct
		public void init() {
			final ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/xml-context.xml"}, true, context);
		}

	}
}