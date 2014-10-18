package com.spring.context.model.autobots

import com.spring.context.model.Autobot
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

/**
 * Created by EAD-MASTER on 10/17/2014.
 */
@Service
@Qualifier(value = "WheelJack")
class WheelJack extends Autobot {
    @Override
    void transform() {
        super.transform()
    }

    @Override
    void fireMainWeapon() {
        super.fireMainWeapon()
    }
}
