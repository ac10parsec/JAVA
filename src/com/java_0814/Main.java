package com.java_0814;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//T1 t1 = new T1();
		T1 t1 = (T1) context.getBean("t1"); // get from container
		t1.print();
		t1.run();
		
		/*
		T2 t2 = (T2) context.getBean("t2");
		// insert
		t2.insert("111"); // 0
		t2.insert("222"); // 1
		t2.insert(333); // 2
		
		// select
		System.out.println(t2.select(2));
		
		// update
		t2.update(2, "444");
		
		// delete
		t2.delete(2);
		*/
		
	}

}
