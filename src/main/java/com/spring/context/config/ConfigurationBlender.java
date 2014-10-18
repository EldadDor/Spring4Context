package com.spring.context.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.springframework.core.io.Resource;

/**
 * Created by EAD-MASTER on 10/10/2014.
 */
public class ConfigurationBlender {

	private ApplicationContext currentContext;

	public ApplicationContext initializeXmlContext(String[] xmlFiles) {
		currentContext = new ClassPathXmlApplicationContext(xmlFiles, true, currentContext);
		return currentContext;
	}

	public ApplicationContext initializeAnnotationContext(Class<?> annClass) {
		currentContext = new AnnotationConfigApplicationContext(annClass);
		return currentContext;
	}

	public ApplicationContext reinitializeAnnotationContext(Class<?> annClass) {
		final AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
		configApplicationContext.setParent(currentContext);
		configApplicationContext.register(annClass);
		configApplicationContext.refresh();
		currentContext = configApplicationContext;
		return currentContext;
	}

	public ApplicationContext initializeGroovyContext(boolean isOrphan, Resource... resources) {
		if (isOrphan) {
			currentContext = new GenericGroovyApplicationContext(resources);
			return currentContext;
		}
		final GenericGroovyApplicationContext groovyApplicationContext = new GenericGroovyApplicationContext();
		groovyApplicationContext.load(resources);
		groovyApplicationContext.setParent(currentContext);
		groovyApplicationContext.refresh();
		currentContext = groovyApplicationContext;
		return currentContext;
	}

	public void grails() {

	}
}
