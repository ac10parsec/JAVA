package com.java_0424;

public class JavaEx1 {
	
	public void ex1(int num) {
		if (num > 0) {
			System.out.println("결과는 Plus 입니다.");
		} else if (num == 0) {
			System.out.println("결과는 0 입니다.");
		} else {
			System.out.println("결과는 Minus 입니다.");
		}
	}
	
	public void ex2(int score) {
		String grade;
		switch(score/10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F"; break;
		}
		System.out.println("시험 결과는 "+grade+" 입니다.");
	}
	
	public void ex3(int a, int b, int c) {
		if (a > b && a > c) {
			if (b > c) System.out.println("정렬한 결과 : "+a+" "+b+" "+c+" 입니다.");
			else System.out.println("정렬한 결과 : "+a+" "+c+" "+b+" 입니다.");
		} else if (b > a && b > c) {
			if (a > c) System.out.println("정렬한 결과 : "+b+" "+a+" "+c+" 입니다.");
			else System.out.println("정렬한 결과 : "+b+" "+c+" "+a+" 입니다.");
		} else if (c > a && c > b) {
			if (a > b) System.out.println("정렬한 결과 : "+c+" "+a+" "+c+" 입니다.");
			else System.out.println("정렬한 결과 : "+c+" "+b+" "+a+" 입니다.");
		}
	}
	
	public void ex4(int len) {
		String result;
		if (len >= 50 && len <= 70) {
			result = "Win";
		} else if (len%6 == 0) {
			result ="Win"; 
		} else {
			result = "Lose";
		}
		System.out.println(result);
	}
	
	public void ex5(int a, int b, int c) {
		if (a > 170) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH "+a);
			return;
		}
		
		if (b > 170) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH "+b);
			return;
		}
		
		if (c > 170) {
			System.out.println("PASS");
		} else {
			System.out.println("CRASH "+c);
		}
	}
	
}
