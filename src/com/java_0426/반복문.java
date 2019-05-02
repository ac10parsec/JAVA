package com.java_0426;

import java.util.Scanner;

public class 반복문 {
	
	/***
	 * while문
	 ***/
	
	public void lv4() {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 간격은? ");
		int xaxis = scan.nextInt(); // x축으로 출력 나올 갯수를 입력받음
		for (int y = 1; y <= 9; y += xaxis) {
			for (int x = 1; x <= 9; x++) {
				for (int z = 0; z < xaxis; z++) {
					int t = y + z;
					System.out.print(t+" * "+x+" = "+t*x+"\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		scan.close();
	}
	
	public void lv5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("X축 갯수: "); int xaxis = scan.nextInt(); 
		System.out.print("Y축 갯수: "); int yaxis = scan.nextInt();
		for (int i = 1; i <= xaxis*yaxis; i += xaxis) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k < xaxis; k++) {
					int t = i + k;
					if (t <= 9) { 
						System.out.print(t+" * "+j+" = "+t*j+"\t");
					} else {
						break;
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
		scan.close();
	}
	
	public void test() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (i%5 == 0 || j%5 == 0 || i == j || i + j == 10) {
					System.out.print(" ■ ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
	}
	
	
}
