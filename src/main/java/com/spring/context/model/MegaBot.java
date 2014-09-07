package com.spring.context.model;

/**
 * Created by EAD-MASTER on 9/7/2014.
 */
public abstract class MegaBot implements Transformer {
	protected abstract void Unite();

	protected abstract void mergeTransformer(Transformer transformer);
}
