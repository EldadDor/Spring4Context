package com.spring.context.model.autobots;

import com.spring.context.model.Autobot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by EAD-MASTER on 9/7/2014.
 */
public class IronHide extends Autobot {
	private final static Logger logger = LogManager.getLogger(IronHide.class.getName());

	private String mainWeapon;

	public IronHide(String mainWeapon) {
		this.mainWeapon = mainWeapon;
	}

	public IronHide() {
	}

	@Override
	public void transform() {
		super.transform();
		logger.info("transform");
	}

	@Override
	public void fireMainWeapon() {
		super.fireMainWeapon();
		logger.info("fireMainWeapon=" + mainWeapon);
	}
}
