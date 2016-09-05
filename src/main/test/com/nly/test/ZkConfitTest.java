package com.nly.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nly.zk.service.IZkConfigService;

public class ZkConfitTest {
	
	@Test
	public void queryCountTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/nly/zk/MET-INF/spring.xml");
		IZkConfigService zkConfigService = (IZkConfigService) context.getBean("zkConfigService");
		int count = zkConfigService.queryCount();
		System.out.println(count);
	}
	
}
