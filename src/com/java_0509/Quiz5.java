package com.java_0509;

import java.util.Scanner;

public class Quiz5 { // 출제자: 유승환
	
	int[][] map = {
			{1,1,1,1,1,1,1,1,1,1,1,1}, // y = 0
			{1,0,0,1,0,0,0,1,0,0,0,1}, // y = 1
			{1,0,1,1,1,0,0,1,0,1,0,1}, // y = 2
			{1,0,0,0,0,1,0,1,0,1,0,1}, // y = 3
			{1,0,0,0,1,0,0,1,0,0,0,1}, // y = 4
			{1,0,1,1,0,0,0,1,0,1,0,1}, // y = 5
			{1,0,0,0,1,0,0,1,0,1,0,1}, // y = 6
			{1,0,0,0,1,0,0,1,0,1,0,1}, // y = 7
			{1,0,0,1,0,0,0,1,0,1,0,1}, // y = 8
			{1,0,1,0,0,1,0,1,0,1,0,1}, // y = 9
			{1,0,0,0,0,0,0,0,0,1,0,1}, // y = 10
			{1,1,1,1,1,1,1,1,1,1,0,1}  // y = 11
	};
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		int ay = 1; int ax = 1; int by = 1; int bx = 1;
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
				if (ay == 8 && ax == 1) {
					ay = 10;
					ax = 1;
					view(ay,ax,by,bx);
				} else if (ay == 10 && ax == 4) {
					ay = 4;
					ax = 9;
					view(ay,ax,by,bx);
				}
				by = ay;
				bx = ax;
			} else { // 이동 ㄴㄴ
				ay = by;
				ax = bx;
			}
			if (ay == 11 && ax == 10) {
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
