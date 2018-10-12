package de.slag.finance.data.impl;

import org.springframework.stereotype.Repository;

import de.slag.central.data.impl.AbstractApplicationBeanDao;
import de.slag.finance.data.SeValueDao;
import de.slag.finance.model.SeValue;

@Repository
public class SeValueDaoImpl extends AbstractApplicationBeanDao<PersistSeValue, SeValue> implements SeValueDao {

	@Override
	protected Class<PersistSeValue> getBeanClass() {
		return PersistSeValue.class;
	}

}