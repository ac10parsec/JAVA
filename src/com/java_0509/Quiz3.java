package com.java_0509;

import java.util.Scanner;

public class Quiz3 { // 출제자: 김민정
	
	int[][] map = {
			{1,1,1,1,1,1}, // y = 0
			{0,0,0,0,1,0}, // y = 1
			{0,1,1,0,1,0}, // y = 2
			{0,0,1,0,1,0}, // y = 3
			{1,0,0,0,0,0}, // y = 4
			{1,1,1,1,1,1}, // y = 5
	};
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		int ay = 3; int ax = 0; int by = 3; int bx = 0;
		view(ay,ax,by,bx);
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			String motion = scan.next();
			switch (motion) {
			case "w": // 위로 이동
				ay--;
				break;
			case "s": // 아래로 이동
				ay++;
				break;
			case "d": // 오른쪽으로 이동
				ax++;
				break;
			case "a": // 왼쪽으로 이동
				ax--;
				break;
			default:
				System.out.println("잘못된 이동입니다!");
				break;
			}
			if (view(ay,ax,by,bx)) { // 이동 ㅇㅇ
				if (ay == 4 && ax == 1) {
					ay = 3;
					ax = 0;
					view(ay,ax,by,bx);
				} else if (ay == 1 && ax == 3) {
					ay = 3;
					ax = 3;
					view(ay,ax,by,bx);
				}
				by = ay;
				bx = ax;
			} else {
				ay = by;
				ax = bx;
			}
			if (ay == 1 && ax == 5) {
				System.out.println("도착!");
				scan.close();
				break;
			}
		}
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
