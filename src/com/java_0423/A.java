package com.java_0423;

public class A {
	
	public A() { // 기본 생성자 // 2
		new B("안녕!"); // B 클래스 생성자 생성
	} 
	
	public A(String msg) { // 4
		System.out.println("B Class:" + msg);
	}
}
