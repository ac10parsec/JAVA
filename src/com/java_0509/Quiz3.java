package com.java_0509;

import java.util.Scanner;

public class Quiz3 { // 출제자: 김민정
	
	int[][] map = {
			{1,1,1,1,1,1}, // y = 0
			{0,0,0,0,1,2}, // y = 1
			{0,1,1,0,1,0}, // y = 2
			{0,0,1,0,1,0}, // y = 3
			{1,0,0,0,0,0}, // y = 4
			{1,1,1,1,1,1}, // y = 5
	};
	
	int ay = 3; int ax = 0; int by = 3; int bx = 0;
	int[] yx;
	
	Scanner scan = new Scanner(System.in);
	Motion mv = new Motion();
	
	public void move() {
		view();
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			
			yx = mv.mv(scan.next(),ay,ax);
			ay = yx[0]; ax = yx[1];
			
			if (view()) { // 이동 ㅇㅇ
				if (ay == 4 && ax == 1) {
					ay = 3;
					ax = 0;
					System.out.println("처음으로!");
					view();
				} else if (ay == 1 && ax == 3) {
					ay = 3;
					ax = 3;
					view();
				}
				by = ay;
				bx = ax;
			}
			
			if (ay == 1 && ax == 5) {
				System.out.println("도착!");
				scan.close();
				break;
			}
		}
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
						System.out.print(" ○ ");
					} else {
						System.out.print(" □ ");
					}
				}
			}
			System.out.println();
		}
		
		return go;
	}
	
}
