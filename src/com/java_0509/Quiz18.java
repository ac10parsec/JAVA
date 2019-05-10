package com.java_0509;

import java.util.Scanner;

public class Quiz18 { // 출제자: 주현석
	
	int[][] map = {
			{1,1,1,1,1,1,1,1,1,1,1,1}, // y = 0
			{1,0,1,1,1,0,0,0,1,1,2,1}, // y = 1
			{1,0,0,0,0,0,1,0,0,0,0,1}, // y = 2
			{1,1,1,0,1,0,1,1,1,0,1,1}, // y = 3
			{1,2,1,0,1,0,1,0,1,0,0,1}, // y = 4
			{1,0,1,0,1,0,1,0,1,0,1,1}, // y = 5
			{1,0,0,0,0,0,1,0,0,0,1,1}, // y = 6
			{1,1,0,1,1,0,1,1,1,0,1,1}, // y = 7
			{1,1,0,1,0,0,0,1,0,0,0,1}, // y = 8
			{1,1,0,1,0,1,0,0,0,0,1,1}, // y = 9
			{1,1,0,0,0,1,1,1,1,0,0,1}, // y = 10
			{1,1,1,1,1,1,1,1,1,1,1,1}  // y = 11
	};
	
	int ay = 1; int ax = 1; int by = 1; int bx = 1;
	int[] yx;
	String motion;
	Motion mv = new Motion();
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		view(ay,ax,by,bx);
		int check = 0;
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			motion = scan.next();
			yx = mv.mv(motion,ay,ax);
			ay = yx[0];
			ax = yx[1];
			
			if (view(ay,ax,by,bx)) {
				by = ay;
				bx = ax;
			} else {
				ay = by;
				ax = bx;
			}
			
			if (map[ay][ax] == 2) {
				map[ay][ax] = 0;
				check++;
				System.out.println("check: "+check);
			}
			
			if (ay == 10 && ax == 10 && check == 2) {
				System.out.println("끝!");
				break;
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
