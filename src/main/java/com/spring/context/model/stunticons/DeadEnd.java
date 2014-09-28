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
public class DeadEnd extends Decepticon {
	private final static Logger logger = LogManager.getLogger(DeadEnd.class.getName());

	@Override
	public void transform() {
		logger.info("Face it: we're doomed.");
		super.transform();
	}
}