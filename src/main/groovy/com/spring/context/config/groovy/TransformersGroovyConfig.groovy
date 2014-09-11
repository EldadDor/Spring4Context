package com.spring.context.config.groovy

import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource


/**
 * @author eldad
 * @date 07/09/2014
 */
@Configuration
@ImportResource(reader = GroovyBeanDefinitionReader.class, value = "spring/groovy-context.groovy")
class TransformersGroovyConfig {
}
