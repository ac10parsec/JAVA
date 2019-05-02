package com.java_0429;

import java.util.Scanner;

public class 배열 {
	
	public void t1() { // 규칙성이 없을 때 사용함
		boolean [][] table = new boolean[5][5];
		table[0][0] = false; table[0][1] = false; 
		table[0][2] = false; table[0][3] = false; table[0][4] = false;
		
		table[1][0] = true; table[1][1] = true;
		table[1][2] = true; table[1][3] = true; table[1][4] = true;
		
		table[2][0] = false; table[2][1] = false;
		table[2][2] = false; table[2][3] = false; table[2][4] = false;
		
		table[3][0] = true; table[3][1] = true; 
		table[3][2] = true; table[3][3] = true; table[3][4] = true; 		
		
		table[4][0] = true; table[4][1] = true;
		table[4][2] = true; table[4][3] = true; table[4][4] = true;
		
		for (int y = 0; y < table.length; y++) {
			for (int x = 0; x < table[y].length; x++) {
				System.out.print(table[y][x]+"\t");
			}
			System.out.println("");
		}
	}
	
	public void t2() {
		int[][] table = new int[5][5];

		for (int y = 0; y < table.length; y++) {
			for (int x = 0; x < table[y].length; x++) {
				if (y%2 == 0) { // y = 0, 2, 4
					table[y][x] = 0;
				} else { 		// y = 1, 3
					table[y][x] = 1;
				}
				System.out.print(table[y][x]+"\t");
			}
			System.out.println();
		}
	}
	
	public void t3() {
		boolean[][] table = new boolean[5][5];
		
		for (int y = 0; y < table.length; y++) {
			for (int x = 0; x < table[y]. length; x++) {
				if (y == x || y + x == 4) {
					table[y][x] = true;
				} else {
					table[y][x] = false;
				}
				System.out.print(table[y][x]+"\t");
			}
			System.out.println("");
		}
	}
	
//	public void t4() {
////		int[][] table = new int[10][10];
//		
//		for (int y = 0; y < 10; y++) {
//			for (int x = 0; x < 10; x++) {
//				if (y%9 == 0 || x%9 == 0) {
//					System.out.print(" ■ ");
//				} else if (y == 2 || y == 3|| y == 7) {
//					if (x == 2 || x == 3 || x == 5 || x == 7) {
//						System.out.print(" ■ ");
//					} else {
//						System.out.print(" □ ");
//					}
//				} else if (y == 4) {
//					if (x == 3 || x == 4 || x == 5 || x == 7) {
//						System.out.print(" ■ ");
//					} else {
//						System.out.print(" □ ");
//					}
//				} else if (y == 5) {
//					if (x == 3 || x == 4 || x == 5) {
//						System.out.print(" ■ ");
//					} else {
//						System.out.print(" □ ");
//					}
//				} else if (y == 6) {
//					if (x == 2 || x == 3 || x == 4 || x == 5 || x == 7) {
//						System.out.print(" ■ ");
//					} else {
//						System.out.print(" □ ");
//					}
//				} else if (y == 8 && x == 7) {
//					System.out.print(" ■ ");
//				}
//				else {
//					System.out.print(" □ ");
//				}
//			}
//			System.out.println();
//		}
//	}
	
	public boolean t4(int ay, int ax, int by, int bx) {
		boolean result = false;
		int[][] table = {
				{1,1,1,1,1,1,1,1,1,1}, // y = 0
				{1,0,0,0,0,0,0,0,0,1}, // y = 1
				{1,0,1,1,0,1,0,1,0,1}, // y = 2
				{1,0,1,1,0,1,0,1,0,1}, // y = 3
				{1,0,0,1,1,1,0,1,0,1}, // y = 4
				{1,0,0,1,1,1,0,0,0,1}, // y = 5
				{1,0,1,1,1,1,0,1,0,1}, // y = 6
				{1,0,1,1,0,1,0,1,0,1}, // y = 7
				{1,0,0,0,0,0,0,1,0,1}, // y = 8
				{1,1,1,1,1,1,1,1,1,1}  // y = 9 
		};
		
		for (int y = 0; y < table.length; y++) {
			for (int x = 0; x < table[y].length; x++) {
				if (table[ay][ax] == 1) {
					ay = by;
					ax = bx;
					result = true;
				}
				
				if (y == ay && x == ax) {
					System.out.print(" S ");
				} else {
					if (table[y][x] == 1) {
						System.out.print(" ■ ");
					} else {
					System.out.print(" □ ");
					}
				}
			}
			System.out.println("");
		}
		return result;
	}
	
	public void t5() {
		Scanner scan = new Scanner(System.in);
		int ay = 0; int ax = 1; int by = 0; int bx = 1;
		t4(ay,ax,by,bx); // 시작을 위해 필요한 호출
		
		while (true) {
			String input = scan.next();
			switch (input) { // input.toPuuerCase // 입력된 소문자를 대문자로 바꿔줌
			case "w": // 위
				ay--;
				break;
			case "s": // 아래
				ay++;
				break; 
			case "d": // 오른쪽
				ax++;
				break;
			case "a": // 왼쪽
				ax--;
				break;
			default :
				break;
			}
			if (t4(ay,ax,by,bx)) { // 이동을 위해 필요한 호출
				ay = by;
				ax = bx;
			} else {
				by = ay;
				bx = ax;
			}
			if (ay == 8 && ax == 8) {
				scan.close();
				break;
			}
		}
		System.out.println("while문 종료 :D");
	}
	


}
