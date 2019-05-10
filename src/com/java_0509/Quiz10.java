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
			case "a":
				ax--;
				break;
			case "d":
				ax++;
				break;
			default:
				System.out.println("잘못된 이동입니다!");
				break;
			}
			
			if (view(ay,ax,by,bx)) {
				by = ay;
				bx = ax;
			} else {
				ay = ax;
				ax = bx;
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
					view(ay,ax,by,bx);
				}
			} 
			
			if (ay == 3 && ax == 7) {
				System.out.println("도착!");
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
