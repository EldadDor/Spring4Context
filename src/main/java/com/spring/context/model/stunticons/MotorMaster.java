/*
 * User: eldad.Dor
 * Date: 07/09/2014 13:06
 
 *
 * Copyright (2005) IDI. All rights reserved.
 * This software is a proprietary information of Israeli Direct Insurance.
 * Created by IntelliJ IDEA. 
 */
package com.spring.context.model.stunticons;

import com.spring.context.model.Decepticon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author eldad
 * @date 07/09/2014
 */
public class MotorMaster extends Decepticon {
	private final static Logger logger = LogManager.getLogger(MotorMaster.class.getName());

	@Override
	public void transform() {
		logger.info("Well, look who's here! The old King of the Road! When I'm finished with ya, you'll be King of the Junkyard!");
		super.transform();
	}
}