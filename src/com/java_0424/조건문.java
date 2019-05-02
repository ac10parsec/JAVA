package com.java_0424;

public class 조건문 {

	/***
	 * 1. if문 - 참 거짓 확인
	 * if (조건식) {} - 조건 // 필수
	 * else {} - if 조건이 아닌 것
	 * else if () {} - 두번째 조건이 필요할 때
	 *** 비교자 >> 대상 (비교자) 비교대상
	 * == : 같다 // 문자열 비교 ㄴㄴ
	 * != : 같지 않다
	 * >  : 크다
	 * <  : 작다
	 * >= : 크거나 같다
	 * <= : 작거나 같다
	 ***
	 * 2. switch문 // 조합키 사용할 때 좋음 // 게임할 때 동시에 키 여러개 누르면 특수효과 나오는것처럼
	 * switch (비교값)
	 * case 값 : 비교값과 값이 같으면 실행
	 * default : 비교값이 case 값에 없으면 실행
	 ***/
	
	public void t1(int a) {
		if(10 == a) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}	
	}
	
	public boolean t2(int a) { // 불린 자료형
		if(10 == a) {
			return true; // 항상 true
		} else {
			return false; // 항상 false
		}
	}
	
	public int t3(int a, int b) {
		if (a == b) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int t4(int a, int b) {
		if (a > b) {
			return a;
		} else if (a < b) {
			return b;
		} else {
			return -1;
		}
	}
	
	public String t5(int a, int b) {
		if(a == b) {
			return "a == b";
		} else if (a != b) {
			return "a != b";
		} else if (a > b) {
			return "a > b";
		} else if (a < b) {
			return "b > a";
		} else if (a >= b) {
			return "a >= b";
		} else if (a <= b) {
			return "b >= a";
		} else {
			return "비교불가";
		}
	}
	
	public String t6(int a, int b) {
		if (a == b) {
			return "a == b";
		}
		if (a != b) {
			return "a != b";
		}
		if (a > b) {
			return "a > b";
		}
		if (a < b) {
			return "a < b";
		}
		return "두개의 값을 비교할 수 없다.";
	}
	
	public String t7(int a, int b) {
		String msg = "";
		if (a == b) {
			msg = "a == b";
		}
		if (a != b) {
			msg = "a != b";
		}
		if (a > b) {
			msg = "a > b";
		}
		if (a < b) {
			msg = "a < b";
		}
		return msg;
	}
	
	public String t8(int a) { // case 값이 고정되어 있을 때 사용함
		String msg = "";
		switch (a) {
		case 0:
			msg = "0 전달 받음";
			break;
		default:
			msg = "전달값이 case에 없음";
			break;
		}
		return msg;
	}
	
	public String t9(int a) {
		String msg = "";
		
		switch (a) {
		case 0:
			msg = msg + "0 비교";
		case 1:
			msg = msg + "1 비교";
			//break;
		case 2:
			msg = msg + "2 비교";
			break;
		default:
			msg = "not 0 ~ 2";
			break;
		}
		return msg;
	}
	
	public String t10(int score) {
		String grade = "";
		
		switch (score/10) {
		case 10:
		case 9: grade = "a"; break;
		case 8: grade = "b"; break;
		case 7: grade = "c"; break;
		case 6: grade = "d"; break;
		default : grade = "f"; break;
		}
		return grade;
	}
	
	
	
}
