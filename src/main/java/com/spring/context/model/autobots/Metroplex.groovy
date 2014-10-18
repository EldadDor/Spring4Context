package com.spring.context.model.autobots

import com.spring.context.model.Transformer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier

/**
 * Created by EAD-MASTER on 10/18/2014.
 */
class Metroplex {
    @Autowired
    def IronHide autobot

    @Autowired
    @Qualifier(value = "WheelJack")
    def Transformer wheelJack;

}
