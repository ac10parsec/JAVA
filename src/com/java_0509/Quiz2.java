package com.java_0509;

import java.util.Scanner;

public class Quiz2 { // 출제자: 염종찬
	
	int[][] map = {
			{0,0,0,0,0,0,0}, // y = 0
			{0,0,0,1,0,0,0}, // y = 1
			{0,0,1,1,1,0,0}, // y = 2
			{0,1,1,1,1,1,0}, // y = 3
			{0,0,1,1,1,0,0}, // y = 4
			{0,0,0,1,0,0,0}, // y = 5
			{0,0,0,0,0,0,0}  // y = 6
	};
	
	int ay = 0; int ax = 6; int by = 0; int bx = 6;
	int[] yx;
	
	Scanner scan = new Scanner(System.in);
	Motion mv = new Motion();
	
	public void move() {
		view();
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			yx = mv.mv(scan.next(),ay,ax);
			ay = yx[0]; ax = yx[1];
			view();

			if (ay == 3 && ax == 3) {
				System.out.print("게임을 그만 두시겠습니까? ");
				String input = scan.next();
				if ("yes".equals(input)) {
					System.out.println("게임이 종료되었습니다.");
					scan.close();
					break;
				}
			} else {
				by = ay;
				bx = ax;
			}
		}
	}
	
	public void view() {
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
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
	}
}
