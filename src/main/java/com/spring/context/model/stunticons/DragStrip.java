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
public class DragStrip extends Decepticon {
	private final static Logger logger = LogManager.getLogger(DragStrip.class.getName());

	@Override
	public void transform() {
		logger.info("One more word out of you, and I'll stomp my alt-mode");
		super.transform();
	}
}