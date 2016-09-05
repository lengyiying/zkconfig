package com.nly.zk.action;

import org.apache.struts2.dispatcher.DefaultActionSupport;

import com.nly.zk.service.IZkConfigService;

public class ZkConfigAction extends DefaultActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IZkConfigService zkConfigService;
	
	public String queryCount() {
		zkConfigService.queryCount();
		
		return "SUCCESS";
	}
}
