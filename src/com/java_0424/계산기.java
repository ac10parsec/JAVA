package com.java_0424;

public class 계산기 {
	
	public int 덧셈(int a, int b) {
		return (a+b);
	}
	
	public int 뺄셈(int a, int b) {
		return (a-b);
	}
	
	public float 나눗셈(int a, int b) {
		return (float) (a/b); // float: 명시적 형변환 = 기본자료형 변환 
	}
	
	public float 곱셈(int a, int b) {
		return (float) (a*b);
	}
	
	public void test(int a, int b) {
		System.out.println("a : " + a + ", b : " + b);
	}

}
