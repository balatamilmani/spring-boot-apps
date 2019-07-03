package com.balatamilmani.cachedemo.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DummyDaoImpl implements IDummyDao {

    private static final Logger logger = LogManager.getLogger(DummyDaoImpl.class);

	@Override
	@Cacheable("daoValue")
	public String getCachableData(String id) {
		// TODO Auto-generated method stub
		logger.info("in DAO's getCachableData");
		return "Dummy DAO value";
	}

}
