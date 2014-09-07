/*
 * User: eldad.Dor
 * Date: 07/09/2014 10:47
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.spring.context.config.annotation;

import com.spring.context.model.Decepticon;
import com.spring.context.model.combaticons.Swindle;
import com.spring.context.model.combaticons.Vortex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author eldad
 * @date 07/09/2014
 */
@Configuration
@ComponentScan("com.spring.context.model.combaticons.")
public class TransformersAnnotationConfig {
	@Bean
	Decepticon swindle() {
		return new Swindle();
	}

	@Bean
	Decepticon vortex() {
		return new Vortex();
	}
}