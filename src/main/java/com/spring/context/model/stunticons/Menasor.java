package com.spring.context.model.stunticons;

import com.beust.jcommander.internal.Lists;
import com.spring.context.model.Decepticon;
import com.spring.context.model.MegaBot;
import com.spring.context.model.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by EAD-MASTER on 9/7/2014.
 */
public class Menasor extends MegaBot {
	private List<Decepticon> bodyParts = Lists.newArrayList();
	@Autowired
//	@Qualifier(value = "deadEnd")
	private DeadEnd leftHand;
	@Autowired
	@Qualifier(value = "breakDown")
	private Breakdown rightHand;
	@Autowired
	@Qualifier(value = "motorMaster")
	private MotorMaster head;
	@Autowired
//	@Qualifier(value = "wildRider")
	private WildRider leftLeg;
	@Autowired
	@Qualifier(value = "dragStrip")
	private DragStrip rightLeg;

	@Override
	protected void Unite() {
		bodyParts.add(leftHand);
		bodyParts.add(rightHand);
		bodyParts.add(head);
		bodyParts.add(leftLeg);
		bodyParts.add(rightLeg);
	}

	@Override
	protected void mergeTransformer(Transformer transformer) {
		for (Decepticon bodyPart : bodyParts) {
			bodyPart.transform();
		}
	}

	@Override
	public void transform() {

	}

	@Override
	public void fireMainWeapon() {

	}
}
