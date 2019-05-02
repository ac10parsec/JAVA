package com.java_0426;

public class 반복문2 {
	
	public void t1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Break 전"); // 코드 실행 가능
			break;						   // 실행 정지
//			System.out.println("Break 후"); // 코드 작성 불가
		}
	}
	
	public void t2() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Continue 전"); // 코드 실행 가능
			continue;						  // 다음 행으로 이동 == Jump
//			System.out.println("Continue 후"); // 코드 작성 불가
		}
	}
	
	public void t3() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"번째 출력");
			if (i%2 == 0) {
				continue;
			} else {
				break;
			}
		}
	}
	
	public void t4(int stop) {
		for (int i = 0; i < 10; i++) {
			if (i%2 == 0) {
				continue;
			} else if (i == stop) {
				break;
			}
			System.out.println(i+"번째 출력");
		}
	}
}
