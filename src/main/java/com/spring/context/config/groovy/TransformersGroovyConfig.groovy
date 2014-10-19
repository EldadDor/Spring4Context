package com.spring.context.config.groovy

import com.spring.context.model.autobots.FortressMaximus
import com.spring.context.model.autobots.IronHide
import com.spring.context.model.autobots.Metroplex
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader
import org.springframework.context.annotation.*

/**
 * @author eldad
 * @date 07/09/2014
 */
@Configuration
@ImportResource(reader = GroovyBeanDefinitionReader.class, value = "spring/groovy-context.groovy")
@ComponentScan("com.spring.context.model.autobots")
class TransformersGroovyConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    IronHide ironHide() {
        return new IronHide("Water Gun")
    }

    @Bean
    FortressMaximus fortressMaximus() {
        return new FortressMaximus()
    }

    @Bean
    Metroplex Metroplex() {
        return new Metroplex()
    }

}
