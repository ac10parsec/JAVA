package com.java_0425;

public class 반복문1 {

	/***
	 * for문: for (1, 2, 3) {실행문}
	 * 1) 초기화식: for문에서 사용할 변수 선언 및 초기값 정의
	 * 2) 조건식: if문과 동일하게 거짓을 찾기 위한 조건
	 * 3) 증감식: for문에서 사용할 변수를 변화를 주기 위한 식
	 ***/
	
	public void t1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}		
	}
	
	public void t2(int s) {
		for (int i = 0; i < s; i++) {
			System.out.println(i);
		}
	}
	
	public void t3(int a, int b) {
		System.out.println("t3 반복문 시작!");
		for(; a < b; a++) {
			System.out.println(a);
		}
		System.out.println("t3 반복문 종료!");
	}
	
	public void t4() {
		for (int i = 0; i <= 5; i++) { // 0 ~ 4
			if (i%2 == 0) {
				System.out.print(i + " - ★짝수★");
			} else {
				System.out.print(i + " - ☆홀수☆");
			}
			System.out.println("");
		}
	}
	
	public void t5() {
		for (int i = 1; i <= 5; i++) { 
			for (int j = 1; j <= i; j++) {
				if (j%2 == 0) {
					System.out.print("★");
				}  else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
	}
	
//	public void t6() {
//		for (int i = 0; i <= 5; i++) {
//			if (i%2 == 0) {
//				//System.out.print("i = "+ i);
//				for (int j = 0; j <= i; j++) {
//					if (j%2 == 0) {
//						System.out.print("★");
//					} else {
//						System.out.print("☆");
//					}
//				}
//			} else {
//				//System.out.print("i= "+i);
//				for (int j = 0; j <= i; j++) {
//					if (j%2 == 0) {
//						System.out.print("☆");
//					}  else {
//						System.out.print("★");
//					}
//				}
//			}
//			System.out.println("s");
//		}
//	}
	
	public void t6() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				if ((i-j)%2 == 0) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println("s");
		}
	}
	
	public void t7() {
		int k;
		for (int i = 0; i < 9; i++) {
			if (i <= 4) {
				k = i;
			} else {
				k = 8 - i;
			}
			for (int j = 0; j <= k; j++) {
				if ((j)%2 == 0) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}			
	}
	
//	public void t7() {
//		int t = 0;
//		for (int i = 0; i < 9; i++) {
//			if (i > 4) {
//				t = t - 2;		
//			}
//			
//			for (int j = 0; j <= t; j++) {
//				if (j%2 == 0) {
//					System.out.print("★");
//				} else {
//					System.out.print("☆");
//				}
//			}
//			
//			t++;
//			System.out.println("");
//		}
//	}
	
	public void t8() {
		int k;
		for (int i = 0; i < 9; i++) {
			if (i <= 4) {
				k = i;
			} else {
				k = 8 - i;
			}
			for (int j = 0; j <= k; j++) {
				if (((k-j))%2 == 0) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}			
	}
	
//	public void t8() {
//		int t = 0;
//		for (int i = 0; i < 9; i++) {
//			if (i > 4) {
//				t = t - 2;		
//			}
//			
//			for (int j = 0; j <= t; j++) {
//				if ((t-j)%2 == 0) {
//					System.out.print("★");
//				} else {
//					System.out.print("☆");
//				}
//			}
//			
//			t++;
//			System.out.println("");
//		}
//	}
	
	public void t9() {
		System.out.println("난이도: 1");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println("");			
		}
	}
	
	public void t10() {
		System.out.println("난이도: 2");
		for (int i = 1; i <= 7; i+=3) { // 1 2 3; 4 5 6; 7 8 9
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k <= 2; k++) {
					int x = i + k;
					System.out.print(x+" * "+j+" = "+x*j+"	");
				}
				System.out.println("");
			}
			System.out.println("");
		}		
	}
	
	public void t11() {
		System.out.println("난이도: 3");
		for (int i = 1; i <= 3; i++) { //1 4 7; 2 5 8; 3 6 9 //
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k <= 6; k+=3) {
					int x = i + k;
					System.out.print(x+" * "+j+" = "+x*j+"	");
				}
				System.out.println("");
			}
			System.out.println("");
		}		
	}
	
	public void t12() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (i%10 == 0) {
					System.out.print("─");
				} 
				if (i == 5) {
					if (j == 0) {
						System.out.print("├");
					} else if (j == 5) {
						System.out.print("*");
					} else if (j == 10) {
						System.out.print("┤");
					} else {
						System.out.print("─");
					}
				}
				if (j%5 == 0) {
					if (i%5 != 0) {
						System.out.print("│");
					}
				}
				if (i%5 != 0 && j%5 != 0) {
					if (i == j) {
						System.out.print("\\");
					} else if (i + j == 10) {
						System.out.print("/");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
}
