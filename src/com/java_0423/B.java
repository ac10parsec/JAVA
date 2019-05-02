package com.java_0423;

public class B {
	
	public B(String msg) { // 기본 생성자 아님 // 3
		System.out.println("A Class:" + msg);
		new A("하이!");
	}

}
