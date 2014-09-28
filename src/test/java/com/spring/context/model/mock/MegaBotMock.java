package com.spring.context.model.mock;

import com.beust.jcommander.internal.Lists;
import com.spring.context.model.Decepticon;
import com.spring.context.model.MegaBot;
import com.spring.context.model.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by EAD-MASTER on 9/26/2014.
 */
public class MegaBotMock extends MegaBot {
	private List<Decepticon> bodyParts = Lists.newArrayList();
	@Autowired
//	@Qualifier(value = "deadEnd")
	private StunticonMock leftHand;
	@Autowired
	@Qualifier(value = "breakDown")
	private StunticonMock rightHand;
/*
	@Autowired
	@Qualifier(value = "motorMaster")
	private MotorMaster head;
	@Autowired
//	@Qualifier(value = "wildRider")
	private WildRider leftLeg;
	@Autowired
	@Qualifier(value = "dragStrip")
	private DragStrip rightLeg;
*/

	@Override
	protected void Unite() {

	}

	@Override
	protected void mergeTransformer(Transformer transformer) {

	}

	@Override
	public void transform() {

	}

	@Override
	public void fireMainWeapon() {

	}
}
