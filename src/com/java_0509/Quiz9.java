package com.java_0509;

import java.util.Scanner;

public class Quiz9 { // 출제자: 임상혁
	
	int[][] map = {
			{1,1,1,1,1,1,1,1,1,1}, // y = 0
			{1,0,2,0,0,0,5,5,5,1}, // y = 1
			{1,0,2,0,3,0,0,0,5,1}, // y = 2
			{1,0,2,0,3,0,4,0,0,1}, // y = 3
			{1,0,2,0,3,0,4,0,0,1}, // y = 4
			{1,0,2,0,3,0,4,0,0,1}, // y = 5
			{1,0,2,0,3,0,4,0,0,1}, // y = 6
			{1,0,2,0,3,0,4,4,0,1}, // y = 7
			{1,0,0,0,3,0,0,0,0,1}, // y = 8
			{1,1,1,1,1,1,1,1,0,1}  // y = 11
	};
	
	int ay = 1; int ax = 1; int by = 1; int bx = 1;
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		view(ay,ax,by,bx);
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			String motion = scan.next();
			switch (motion) {
			case "w":
				ay--;
				break;
			case "s":
				ay++;
				break;
			case "d":
				ax++;
				break;
			case "a":
				ax--;
				break;
			default:
				System.out.println("잘못된 이동입니다!");
				break;
			}
			
			if (view(ay,ax,by,bx)) {
				by = ay;
				bx = ax;
			} else {
				ay = by;
				ax = bx;
			}
			
			if (ay == 9 && ax == 8) {
				System.out.println("도착!");
				break;
			}
		}
		scan.close();
	}
	
	public boolean view(int ay, int ax, int by, int bx) {
		boolean go =  true;
		
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				if (map[ay][ax] > 0) {
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
						System.out.print(" ● ");
					} else if (map[y][x] == 3) {
						System.out.print(" ○ ");
					} else if (map[y][x] == 4) {
						System.out.print(" ♥ ");
					} else if (map[y][x] == 5) {
						System.out.print(" ▲ ");
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
