package com.java_0423;

public class Var { // class
	
	public Var() {} // 기본생성자
	
	// 1
	//void var() { // 동적 메모리 할당 // default
	
	// 2
	//public void var() { // public
		
	// 3
	//public static void var() { // 정적 메모리 할당
	
	public int state1; // class 속에 있으서 전역변수 // method 속에 있으면 지역 변수
	protected int state2;
	int state3;
	private int state4;
	
	void var() {	// method	
		/*********************************
		 * 변수 사용법
		 * 1. 변수 선언
		 * 2. 변수에 데이터 대입 (값 넣기)
		 * 3. 변수 사용 
		 *********************************/
		
		int a; // 1
		a = 1; // 2
		System.out.println(a); // 3
		
		int b = 2; // 1, 2
		System.out.println(b); // 3
		
		int c, d, e; // 1
		c = a; // 2 
		d = b; // 2
		e = c + d; // 2
		System.out.println(e); // 3
		
		int f = 5, g = 7;
		System.out.println(f);
		System.out.println(g);
		
	}
	
	void var2(int a, int b ) {
		System.out.println(a+b);
	}
	
}
