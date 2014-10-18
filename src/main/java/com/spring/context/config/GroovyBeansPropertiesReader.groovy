package com.spring.context.config

import grails.spring.BeanBuilder
import org.springframework.context.ApplicationContext
import org.springframework.jdbc.datasource.SimpleDriverDataSource

import javax.sql.DataSource

class Simple {
    String language
    DataSource dataSource
/*

    Simple(String language) {
        this.language = language
    }
*/

    Simple() {
    }

//    @Autowired
    Simple(DataSource dataSource) {
        this.dataSource = dataSource
    }

    def whatDoYouSpeak() {
        language

    }


    def say(String text) {
        "You say $text in $language"
    }

}

class GroovyBeansLoader {
    def BeanBuilder builder

    def initialize(ApplicationContext context) {
        builder = new BeanBuilder(context)
        builder.beans {
            testDataSource(MockDataSourceFactory) {}
            simple(Simple) {
                dataSource = ref('testDataSource')
            }
        }
        return builder.createApplicationContext()
    }
}
/*

def s = new Simple(language: 'Groovy')

assert s.metaClass.respondsTo(s, 'whatDoYouSpeak')
assert Simple.metaClass.respondsTo(s, 'say')

assert s.metaClass.respondsTo(s, 'say', String)

assert !s.metaClass.respondsTo(s, 'say', Integer)  // No say(Integer) method.

assert Simple.metaClass.respondsTo(s, 'toString')  // Method in parent object.


assert s.metaClass.hasProperty(s, 'language')

assert Simple.metaClass.respondsTo(s, 'getLanguage')  // Get/set methods are generated.

assert s.metaClass.respondsTo(s, 'setLanguage')
*/

BeanBuilder builder = new BeanBuilder()
builder.beans {
    dataSource(SimpleDriverDataSource) {                  // <--- invokeMethod
        driverClass = "org.hsqldb.jdbcDriver"
        url = "jdbc:h2:mem:grailsDB"
        username = "sa"                            // <-- setProperty
        password = ""
    }
    //  settings = [mynew: "setting"]
    testDataSource(MockDataSourceFactory) {}
    simple(Simple) {
        dataSource = ref('testDataSource')
    }
// builder.getSpringConfig().addAlias("testDataSource", "dataSource")
}

//builder.getSpringConfig().addSingletonBean("simple", Simple)
def context = builder.createApplicationContext();
context.getBean("testDataSource")

/*sessionFactory(ConfigurableLocalSessionFactoryBean) { bean ->
    // Autowiring behaviour. The other option is 'byType'. [autowire]
    bean.autowire = 'byName'
    // Sets the initialisation method to 'init'. [init-method]
    bean.initMethod = 'init'
    // Sets the destruction method to 'destroy'. [destroy-method]
    bean.destroyMethod = 'destroy'
    // Sets the scope of the bean. [scope]
    bean.scope = 'request'
    dataSource = ref('dataSource')
    hibernateProperties = ["hibernate.hbm2ddl.auto": "create-drop",
                           "hibernate.show_sql":     "true"]
}*/
/*  sessionFactory(SessionFactory) {
      dataSource = dataSource                 // <-- getProperty for retrieving refs
  }*/
/* myService(MyService) {
     nestedBean = { AnotherBean bean->          // <-- setProperty with closure for nested bean
         dataSource = dataSource
     }
 }*/
