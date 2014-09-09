package spring

import com.spring.context.model.dinobots.Grimlock


beans {
    xmlns context: "http://www.springframework.org/schema/context"
    context.'component-scan'('base-package': "com.spring.context.model.aerialbots")

    grimlock(Grimlock) { bean ->
        bean.factoryMethod = "getInstance"
        bean.singleton = false;
    }
}