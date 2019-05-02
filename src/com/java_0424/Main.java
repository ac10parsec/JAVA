package com.java_0424;

public class Main {

	// 생성자
	// 변수, 상수 - 클래스 전역 - 파란색
	// 메소드 > 변수 - 메소드 전역 - 지역
	// >> 메소드 안에 메소드 생성하지 않음
	// 생성자 안에 생성자 생성하지 않음
	// 메소드 안에 생성자 생성하지 않음
	// 생성자 안에 메소드 생성하지 않음
	// static(정적) : 만들지 않음. 단, main 메소드만 static 사용함 
	// static이 필요하면 메인 밑에 메소드로 만들고 main 메소드를 new 해서 사용함
	// 기능 구현 할 때 가능하면 클래스를 적극 활용 == 객체지향
	
	//int a;
	//
	//void aa() {
	//	int b = 1;
	//	
	//	for(int i = 0; i < 10; i++) {
	//		System.out.println(i); // for문 안에서 사용 가능한 지역 변수
	//		System.out.println(i+b);
	//	}
	
	public static void main(String[] abcdef) {
		계산기 calc = new 계산기(); // 기능: 계산기 
		
		int a = 2; int b = 4;
		int c, d;
		float e, f;
		c = calc.덧셈(a,b); // 덧셈 메소드 호출
		d = calc.뺄셈(a,b); // 뺄셈 메소드 호출
		e = calc.나눗셈(a,b); // 나눗셈 메소드 호출
		f = calc.곱셈(a,b); // 곱셈 메소드 호출
		calc.test(a,b);
	}
	
}