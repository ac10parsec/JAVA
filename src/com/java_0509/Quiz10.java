package com.java_0509;

import java.util.Scanner;

public class Quiz10 { // 출제자: 김은채
	
	int[][] map = {
			{1,1,1,1,1,1,1,1}, // y = 0
			{1,0,2,0,0,0,1,1}, // y = 1
			{0,0,0,0,0,0,0,1}, // y = 2
			{1,0,1,3,0,1,0,0}, // y = 3
			{1,1,1,1,1,1,1,1}   // y = 4
	};
	
	int ay = 2; int ax = 0; int by = 2; int bx = 0;
	int[] yx;
	
	Scanner scan = new Scanner(System.in);
	Motion mv = new Motion();
	
	public void move() {
		view();
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			yx = mv.mv(scan.next(),ay,ax);
			ay = yx[0]; ax = yx[1];
			
			if (view()) {
				by = ay;
				bx = ax;
			} 
			
			if (ay == 1 && ax == 2) {
				System.out.print("'머리조심'을 입력하세요: ");
				while (true) {
					String head = scan.next();
					if ("머리조심".equals(head)) {
						break;
					} else {
						System.out.print("다시 입력하세요: ");
					}
				}
			} 
			
			if (ay == 3 && ax == 3) {
				System.out.print("강사님 성함을 입력하세요: ");
				String head = scan.next();
				if ("김교빈".equals(head)) {
				} else {
					ay = 2;
					ax = 0;
					view();
				}
			} 
			
			if (ay == 3 && ax == 7) {
				System.out.println("도착!");
				break;
			}
		}
		scan.close();
	}
	
	public boolean view() {
		boolean go = true;
		if (map[ay][ax] == 1) {
			ay = by;
			ax = bx;
			go = false;
		}
		
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				if (y == ay && x == ax) {
					System.out.print(" S ");
				} else {
					if (map[y][x] == 1) {
						System.out.print(" ■ ");
					} else if (map[y][x] == 2) {
						System.out.print(" ▼ ");
					} else if (map[y][x] == 3) {
						System.out.print(" ▲ ");
					} else {
						System.out.print((" □ "));
					}
				}
			}
			System.out.println();
		}
		
		return go;
	}
	
}
