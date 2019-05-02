package com.java_0424;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input first valuse");
		int a = scan.nextInt();
		System.out.println("Push calculation type");
		String b = scan.next();
		System.out.println("Input second value");
		int c = scan.nextInt();
		scan.close();
		
		계산기 calc = new 계산기(); // 기능: 계산기 
		
		String msg;
		switch (b) {
		case "+": msg = "" + calc.덧셈(a, c); break;
		case "-": msg = "" + calc.뺄셈(a, c); break;
		case "*": msg = "" + calc.곱셈(a, c); break;
		case "/": msg = "" + calc.나눗셈(a,c); break;
		default: msg = "계산 불가능"; break; 
		}
		System.out.println("ans = " + msg);		
		
	}

}
