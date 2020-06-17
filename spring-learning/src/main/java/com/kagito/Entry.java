package com.kagito;

import com.kagito.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Entry {
	public static void main(String[] args) {
		System.out.println("test main method...");
		//绝对路径多加一个反斜杠"/"
		String xmlPath = "//Users/kagito/Documents/Workspace/Java/spring/spring-framework/spring-learning/src/main/resources/spring/spring-kagito.xml";
		//applicationContext是spring IoC容器的实例
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		//从spring容器中获取Bean实例
		DemoService demoService = (DemoService) applicationContext.getBean("demoService");
		demoService.sayHello("Spring");
	}
}
