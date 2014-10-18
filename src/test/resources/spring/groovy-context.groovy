package spring

import com.spring.context.model.dinobots.Grimlock
import com.spring.context.model.dinobots.Slag
import com.spring.context.model.dinobots.Snarl
import com.spring.context.model.mock.MegaBotMock
import com.spring.context.model.mock.StunticonMock

beans {
    xmlns context: "http://www.springframework.org/schema/context"
    context.'component-scan'('base-package': "com.spring.context.model.aerialbots")

    slag(Slag) {
    }

    grimlock(Grimlock) { bean ->
        bean.factoryMethod = "getInstance"
        bean.singleton = false;
    }

    snarl(Snarl) { bean ->
        bean.autowire = "byName";
    }

    /*stunticons */

    breakDown(StunticonMock) { bean ->
        bean.autowire = "byName";
    }
    deadEnd(StunticonMock) { bean ->
        bean.autowire = "byName";
    }
    motorMaster(StunticonMock) {}
    wildRider(StunticonMock) { bean ->
        bean.autowire = "byName";
    }
    dragStrip(StunticonMock) {}
    menasor(MegaBotMock) { bean ->
        bean.dependsOn = "snarl";
    }
}