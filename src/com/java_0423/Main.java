package com.java_0423;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*********************************
		 * 0. 객체 (Object > Class)
		 * 1. 변수
		 * 2. 메소드 (Method)
		 * 3. 출력
		 * 4. 사칙연산
		 * 5. 접근제한자
		 * 6. 정적 (Static)
		 * 7. 리턴타임 (Void)
		 * 8. 자료형
		 * 9. 매개변수 (메소트 호출 시 같이 보낼 값)
		 *********************************/

		/****
		 *  동적 메모리 할당
		 *  객체(class)  객체변수  대입  생성키워드  객체생성자
		 *  Var         v      =   new     Var();
		 ****/
		
		/****
		 * 동적 메모리 할당
		 ****/
		
		// 1
		Var v = new Var();
		//v.var();
		v.var2(1,5);
		
		// 2
		//new Var();		
		
		/****
		 * 정적 메모리 할당
		 * 메모리를 미리 할당해야해서 메모리를 많이 잡아먹음
		 ****/
		
		// 3
		//Var.var(); // 메모리를 미리 할당해야해서 메모리를 많이 잡아먹음
		
	}

}
