package com.spring.context.config;

import org.mockito.Mockito;
import org.springframework.beans.factory.FactoryBean;

import javax.sql.DataSource;

/**
 * Created by EAD-MASTER on 10/17/2014.
 */
public class MockDataSourceFactory implements FactoryBean<DataSource> {
	@Override
	public DataSource getObject() throws Exception {
		return Mockito.mock(DataSource.class);
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
