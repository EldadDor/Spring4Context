package spring

import com.spring.context.model.autobots.IronHide
import com.spring.context.model.dinobots.Grimlock
import com.spring.context.model.dinobots.Slag
import com.spring.context.model.dinobots.Snarl
import com.spring.context.model.stunticons.*

beans {
    xmlns context: "http://www.springframework.org/schema/context"
    context.'component-scan'('base-package': "com.spring.context.model.aerialbots")

    slag(Slag) {
    }

    ironHide(IronHide) { beanDefinition ->
        beanDefinition.constructorArgs = ['Water gun']
        beanDefinition.scope = 'prototype'
    }

    grimlock(Grimlock) { bean ->
        bean.factoryMethod = "getInstance"
        bean.singleton = false;
    }

    snarl(Snarl) { bean ->
        bean.autowire = "byName";
    }

    breakDown(Breakdown) { bean ->
        bean.autowire = "byName";
    }
    deadEnd(DeadEnd) { bean ->
        bean.autowire = "byName";
    }
    motorMaster(MotorMaster) {}
    wildRider(WildRider) {}
    dragStrip(DragStrip) {}
    menasor(Menasor) { bean ->
        bean.dependsOn = "snarl";
    }
}