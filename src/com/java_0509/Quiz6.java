package com.java_0509;

import java.util.Scanner;

public class Quiz6 { // 출제자: 이강미
	
	int[][] map = {
			{1,1,1,1,1,1,1,1,1,1}, // y = 0
			{1,0,0,0,0,0,0,0,0,1}, // y = 1
			{1,0,2,1,1,0,0,1,0,1}, // y = 2
			{1,0,0,2,1,0,1,0,0,1}, // y = 3
			{1,0,0,1,2,0,0,1,0,1}, // y = 4
			{1,0,0,1,0,2,1,0,0,1}, // y = 5
			{1,0,1,0,0,1,2,0,0,1}, // y = 6
			{1,0,1,0,1,1,0,2,0,1}, // y = 7
			{1,0,0,0,0,0,0,1,3,1}, // y = 8
			{1,1,1,1,1,1,1,1,1,1}   // y = 9
	};
	
	int ay = 1; int ax = 1; int by = 1; int bx = 1;
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
				by = ay;
				bx = ax;
			}
			
			if (ay == 8 && ax == 8) {
				int sum = 0;
				for (int i = 2; i < 8; i++) {
					sum += map[i][i];
				}
				if (sum == 0) {
					System.out.println("도착!");
					scan.close();
					break;
				}
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
						System.out.print(" ♥ ");
					} else if (map[y][x] == 3) {
						System.out.print(" ○ ");
					} else {
						System.out.print(" □ ");
					}
				}
				
				if (map[ay][ax] == 2) {
					map[ay][ax] = 0;
				}
			}
			System.out.println();
		}
		return go;
	}
	
}
