package com.java_0509;

import java.util.Scanner;

public class Quiz19 { // 출제자: 정하린

	int[][] map = {
			{1,1,1,1,1,1,1}, // y = 0
			{1,0,0,1,1,0,1}, // y = 4
			{1,0,0,1,2,0,1}, // y = 5
			{1,0,1,1,1,1,1}, // y = 6
			{1,0,1,1,0,2,1}, // y = 7
			{1,0,0,0,0,0,1}, // y = 8
			{1,1,1,1,1,1,1}   // y = 9
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
			ay = yx[0];
			ax = yx[1];
			
			if (view()) {
				by = ay;
				bx = ax;
			}
			
			if (ay == 4 && ax == 5) {
				ay = 2;
				ax = 4;
				view();
			}
			
			if (ay == 1 && ax == 5) {
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
