/*
 * User: eldad.Dor
 * Date: 07/09/2014 13:08
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.spring.context.config.javaconfig;

import com.spring.context.model.Decepticon;
import com.spring.context.model.combaticons.Swindle;
import com.spring.context.model.combaticons.Vortex;
import com.spring.context.model.decepticons.SoundWave;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author eldad
 * @date 07/09/2014
 */
@Configuration
@ComponentScan("com.spring.context.model.decepticons")
public class TransformersJavaConfig {
	@Bean
	public Decepticon soundWave() {
		return new SoundWave();
	}

	@Bean
	public Decepticon swindle() {
		return new Swindle();
	}

	@Bean
	public Decepticon vortex() {
		return new Vortex();
	}
}