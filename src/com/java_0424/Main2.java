package com.java_0424;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		조건문 t = new 조건문();
		t.t1(10);
		
		boolean r = t.t2(10);
		System.out.println(r);
		
		int i = t.t3(1,5);
		System.out.println(i);
		
		int i2 = t.t4(1,5);
		System.out.println(i2);
		
		String msg = t.t5(1,5);
		System.out.println(msg);
		
		String msg2 = t.t6(1,5);
		System.out.println(msg2);
		
		String msg3 = t.t7(1,5);
		System.out.println(msg3);
		String msg4 = t.t8(1);
		System.out.println(msg4);
		
		String msg5 = t.t9(1);
		System.out.println(msg5);
		
//		System.out.println("점수를 입력하세요.");
//		Scanner scan = new Scanner(System.in); // console 창에서입력값 받는 객체 생성
//		String msg6 = t.t10(scan.nextInt());   // console 창에서 입력 받은 정수를 인자값으로 사용
//		scan.close();                          // scanner 객체 종료 (삭제)
//		System.out.println(msg6);
		
	}

}
