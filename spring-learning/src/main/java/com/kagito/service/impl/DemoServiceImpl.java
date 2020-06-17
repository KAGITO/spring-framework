package com.kagito.service.impl;

import com.kagito.service.DemoService;

/**
 * 告诉spring这是一个需要被管理的bean(放入spring容器)
 */
public class DemoServiceImpl implements DemoService {
	@Override
	public String sayHello(String name) {
		System.out.println("Hello, " + name);
		return "success";
	}
}
