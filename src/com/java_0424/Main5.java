package com.java_0424;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaEx1 Ex = new JavaEx1();
		Scanner scan = new Scanner(System.in);
		
		/***Exam.1
		 * [문제]
		 * 정수를 입력받아 양의 정수를 입력했을때는 “Plus”를 0을 입력받았을 때는 “0”을 음의 정수를 
		 * 입력했을 때는 “Minus”를 출력하게 만드세요.
		 * [결과화면]
		 * 정수를 입력하세요 : -10
		 * 결과는 : MINUS 입니다.
		 ***/
//		System.out.print("정수를 입력하세요: ");
//		Ex.ex1(scan.nextInt());
		
		/***Exam.2
		 * [문제]
		 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
		 * 70~79 점은 C, 60~69점은 D, 나머지 점수는 F를 출려하는 프로그램을 작성하시오.
		 * [결과화면]
		 * 시험 점수를 입력하세요 : 100
		 * 시험 결과는 : A 입니다.
		 ***/
//		System.out.print("시험 점수를 입력하세요: ");
//		Ex.ex2(scan.nextInt());
		
		
		/***Exam.3
		 * [문제]
		 * 세 정수를 입력받아 숫자가 큰 순서대로 정렬해보세요.
		 * [결과화면]
		 * 첫 번째 숫자는 : 10
		 * 두 번째 숫자는 : 50
		 * 세 번째 숫자는 : 7
		 * 정렬한 결과 : 50 10 7 입니다.
		 ***/
//		System.out.print("첫 번째 숫자는 : ");
//		int a = scan.nextInt();
//		System.out.print("두 번째 숫자는 : ");
//		int b = scan.nextInt();
//		System.out.print("세 번째 숫자는 : ");
//		int c = scan.nextInt();
//		Ex.ex3(a, b, c);
		
		/***Exam.4
		 * [문제]
		 * 슬기는 지난 번에도 공던지기에 져서 아이스크림을 사게되었다.
		 * 슬기는 이미 돈이 다 떨어져서 현량이에게 돈을 빌린 상태이다.
		 * 이번에는 슬기가 또 다른 조건을 내걸고 체육 선생님에게 도전하게 되었다.
		 * 1. 공의 위치가 50m~70m 이면 슬기가 이김.
		 * 또는
		 * 2. 공의 위치가 6의 배수이면 슬기가 이김.
		 * 슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을
		 * 출력하고, 그 외에는 "lose"를 출력하시오.
		 * [입력]
		 * 30
		 * [결과화면]
		 * WIN
		 ***/
//		System.out.print("공의 위치 = ");
//		Ex.ex4(scan.nextInt());
		//scan.close();
		
		/***Exam.5
		 * [문제]
		 * 어떤 차의 높이가 170m 이다. 이 차는 3개의 터널 a, b, c를 차례대로 지나게 될 것이다.
		 * 각 터널의 높이가 차의 높이(170170)보다 같거나 낮으면 차는 터널과 충돌하여 사고가 날 것이다.
		 * 각 터널 a, b, c의 높이가 차례대로 3개 입력되면, 터널을 무사히 잘 통과하면 PASS 를 출력하고, 
		 * 사고가 난다면 CRASH 와 처음 충돌하는 터널의 높이를 출력하시오.
		 * [입력]
		 * 171 168 165
		 * [출력조건]
		 * 높이가 170인 차가 잘 통과할 수 있으면 PASS를 출력, 170보다 같거나 작으면 CRASH 처음
		 * 충돌한 터널 높이를 출력하시오.
		 * [결과화면]
		 * CRASH 168
		 ***/
		System.out.print("터널 A의 높이 = ");
		int a = scan.nextInt();
		System.out.print("터널 B의 높이 = ");
		int b = scan.nextInt();
		System.out.print("터널 C의 높이 = ");
		int c = scan.nextInt();
		Ex.ex5(a,b,c);
		scan.close();
	}

}

