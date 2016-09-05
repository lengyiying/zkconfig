package com.nly.zk.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class ZkConfigDao extends SqlSessionDaoSupport implements IZkConfigDao{
	private static final String NAMESPACE = "zk.config.mapper.";
	public Integer queryCount() {
		
		return this.getSqlSession().selectOne(NAMESPACE + "queryCount");
	}

}
