package com.java_0430;

public class Method {
	
	int a;
	
	public static void A() {
		System.out.println("Method A() 호출");
	}
	
	public void A(int a) {
		this.a = a; 
		// a = a 는 안 됨
	}
	
	public void A(String a) {
		System.out.println(a+this.a);
	}

}
