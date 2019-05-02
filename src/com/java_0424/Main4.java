package com.java_0424;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IfEx Ex = new IfEx();
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		scan.close();
		
		Ex.ex1(score); // If Exam.1
		Ex.ex2(score); // If Exam.2
		Ex.ex3(score); // If Exam.3
		Ex.ex4(score); // If Exam.4
		Ex.ex5(score); // Switch Exam.1
		Ex.ex6(score); // Switch Exam.2
	}
}
