package com.spring.context.model.dinobots;

import com.spring.context.model.Autobot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by EAD-MASTER on 9/7/2014.
 */
public class Grimlock extends Autobot {
	private final static Logger logger = LogManager.getLogger(Grimlock.class.getName());

	public Grimlock() {
		logger.info("Grimlock():");
	}

	public static Autobot getInstance() {
		return new Grimlock();
	}
}
