package com.java_0509;

import java.util.Scanner;

public class Quiz13 { // 출제자: 권봉준
	
	int[][] map = { 
			{1,1,1,1,1,1,1,1,1,1}, // y = 0
			{1,0,1,0,0,0,0,0,0,1}, // y = 1
			{1,0,1,0,1,1,0,1,0,1}, // y = 2
			{1,0,1,2,1,0,0,1,0,1}, // y = 3
			{1,0,1,1,1,0,0,1,0,1}, // y = 4
			{1,0,1,0,1,1,1,1,0,1}, // y = 5
			{1,0,0,0,0,0,0,0,0,1}, // y = 6
			{1,0,0,1,1,0,1,1,0,1}, // y = 7
			{1,0,0,1,1,0,0,0,3,1}, // y = 8
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
			String motion = scan.next();
			yx = mv.mv(motion,ay,ax);
			ay = yx[0];
			ax = yx[1];
			
			if (view()) {
				by = ay;
				bx = ax;
			}
			
			if (ay == 3 && ax == 3) {
				map[3][3] = 0;
			}
			
			if (map[ay][ax] == 3 && map[3][3] == 0) {
				System.out.println("끝!");
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
						System.out.print(" ♥ ");
					} else if (map[y][x] == 3) {
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
