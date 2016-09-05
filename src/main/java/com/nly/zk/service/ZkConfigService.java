package com.nly.zk.service;

import com.nly.zk.dao.IZkConfigDao;

public class ZkConfigService implements IZkConfigService{
	
	private IZkConfigDao zkConfigDao;
	
	public int queryCount() {
		return zkConfigDao.queryCount();
	}

	public void setZkConfigDao(IZkConfigDao zkConfigDao) {
		this.zkConfigDao = zkConfigDao;
	}
	
	
}
