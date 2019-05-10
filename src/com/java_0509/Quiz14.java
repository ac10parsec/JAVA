package com.java_0509;

import java.util.Scanner;

public class Quiz14 { // 출제자: 구기준
	
	int[][] map = {
			{1,1,1,1,1,1,1}, // y = 0
			{1,0,0,0,0,0,1}, // y = 4
			{1,0,1,2,1,0,1}, // y = 5
			{1,0,0,1,0,0,1}, // y = 6
			{1,1,0,0,0,1,1}, // y = 7
			{1,1,1,1,0,0,1}, // y = 8
			{1,1,1,1,1,1,1}   // y = 9
	};
	
	int ay = 1; int ax = 1; int by = 1; int bx = 1;
	int[] yx;
	Motion mv = new Motion();
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		view(ay,ax,by,bx);
		
		int count = 0;
		while (true) {
			System.out.println("count: "+count);
			System.out.println("방향을 입력하세요: ");
			String motion = scan.next();
			yx = mv.mv(motion,ay,ax);
			ay = yx[0];
			ax = yx[1];
			count++;
			
			if (view(ay,ax,by,bx)) {
				by = ay;
				bx = ax;
			} else {
				ay = by;
				ax = bx;
			}
			
			if (ay == 2 && ax == 3) {
				count = 0;
				ay = 1; ax = 1;
				by = 1; bx = 1;
				view(ay,ax,by,bx);
			}
			
			if (ay == 5 && ax == 5) {
				if (count <= 8) {
					System.out.println("끝!");
					break;
				} else {
					count = 0;
					ay = 1; ax = 1;
					by = 1; bx = 1;
					view(ay,ax,by,bx);
				}
			}
			
		}
		scan.close();
		
	}
	
	public boolean view(int ay, int ax, int by, int bx) {
		boolean go = true;
		
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				if (map[ay][ax] == 1) {
					ay = by;
					ax = bx;
					go = false;
				}
				
				if (y == ay && x == ax) {
					System.out.print(" S ");
				} else {
					if (map[y][x] == 1) {
						System.out.print(" ■ ");
					} else if (map[y][x] == 2) {
						System.out.print(" ♥ ");
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
