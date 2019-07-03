package com.balatamilmani.cachedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balatamilmani.cachedemo.dao.IDummyDao;

@Service
public class CacheDemoServiceImpl implements ICacheDemoService {

	@Autowired
	IDummyDao dummyDao;
	
	public String getCachableData(String id) {
		return dummyDao.getCachableData(id);
	}
}
