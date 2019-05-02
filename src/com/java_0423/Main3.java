package com.java_0423;

public class Main3 {

	public static void main(String[] args) {
		int a, b, c, d;
		double e, f;
		a = 5;
		b = 3;
		
		c = add(a, b);
		System.out.println(c);
		
		d = sub(a, b);
		System.out.println(d);
		
		e = mul(a,b);
		System.out.println(e);
		
		f = div(a,b);
		System.out.println(f);
	}

	static int add(int a, int b) {
		return a+b;
	}
	
	static int sub(int a, int b) {
		return a-b;
	}
	
	static double mul(int a, int b) {
		return a*b;
	}
	
	static double div(int a, int b) {
		return (double) a/b;
	}

}
