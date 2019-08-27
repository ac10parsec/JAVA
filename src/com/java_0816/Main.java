package com.java_0816;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		RunStack stack = (RunStack) context.getBean("runStack");
		stack.run();
		
	}

}
