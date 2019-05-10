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
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		int ay = 0; int ax = 6; int by = 0; int bx = 6;
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
			view(ay,ax,by,bx);

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
	
	public void view(int ay, int ax, int by, int bx) {
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
