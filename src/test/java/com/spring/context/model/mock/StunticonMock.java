package com.spring.context.model.mock;

import com.spring.context.model.Decepticon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by EAD-MASTER on 9/26/2014.
 */
public class StunticonMock extends Decepticon {
	private final static Logger logger = LogManager.getLogger(StunticonMock.class.getName());

	@Override
	public void transform() {
		super.transform();
		logger.info("I'm A Mock used for down time");
	}
}
