package com.spring.context.config;

import com.spring.context.config.annotation.TransformersAnnotationConfig;
import com.spring.context.config.groovy.TransformersGroovyConfig;
import com.spring.context.config.javaconfig.TransformersJavaConfig;
import com.spring.context.config.xml.TransformersXmlConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by EAD-MASTER on 9/7/2014.
 */
public class ConfigurationLoader {

	public ApplicationContext loadAnnotationContext() {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransformersAnnotationConfig.class);
		return context;
	}

	public ApplicationContext loadGroovyContext() {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransformersGroovyConfig.class);
		return context;
	}

	public ApplicationContext loadJavaConfigContext() {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransformersJavaConfig.class);
		return context;
	}

	public ApplicationContext loadXmlContext() {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TransformersXmlConfig.class);
		return context;
	}

	public static void main(String[] args) {
		final ApplicationContext applicationContext = new ConfigurationLoader().loadGroovyContext();
		System.out.println("applicationContext = " + applicationContext);

	}
}

