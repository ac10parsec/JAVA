package com.java_0424;

public class IfEx {
	String grade;
	
	public void ex1(int score) {
		if (score >= 60) {
			System.out.println("IfEx1: 합격을 축하합니다 :D");
		}
	}
	
	public void ex2(int score) {
		if (score >= 60) {
			System.out.println("IfEx2: 합격을 축하합니다 :D");
		} else {
			System.out.println("IfEx2: 다음에 다시 오세요 ㅠㅠ");
		}
	}
	
	public void ex3(int score) {
		if (score >= 90) {
			System.out.println("IfEx3: A 학점입니다");
		} else if (score >= 80) {
			System.out.println("IfEx3: B 학점입니다");
		} else if (score >= 70) {
			System.out.println("IfEx3: C 학점입니다");
		} else if (score >= 60) {
			System.out.println("IfEx3: D 학점입니다");
		} else {
			System.out.println("IfEx3: F 학점입니다");
		}	
	}
	
	public void ex4(int score) {
		if (score >= 90) {
			if (score >= 95) grade = "A+";
			else grade = "A0";
		} else if (score >= 80) {
			if (score >= 85) grade = "B+";
			else grade = "B0";
		} else if (score >= 70) {
			if (score >= 75) grade = "C+";
			else grade = "C0";
		} else if (score >= 60) {
			if (score >= 65) grade = "D+";
			else grade = "D0";
		} else {
			grade = "F";
		}
		System.out.println("IfEx4: " + grade + "학점입니다.");
	}
	
	public void ex5(int score) {
		switch(score/10) {
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F"; break;
		}
		System.out.println("SwEx1: " + score + "점수는 " + grade + "학점입니다.");
	}
	
	public void ex6(int score) {
		switch(score/10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F"; break;
		}
		System.out.println("SwEx2: " + score + "점수는 " + grade + "학점입니다.");
	}
}
