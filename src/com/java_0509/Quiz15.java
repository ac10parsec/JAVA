package com.java_0509;

import java.util.Scanner;

public class Quiz15 { // 출제자: 김범해
	
	int[][] map = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,2,1},
			{1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,1},
			{1,0,1,0,1,1,1,1,0,1,1,0,0,0,0,1,1,1,1,1},
			{1,0,0,0,1,0,0,1,0,1,1,0,1,0,0,1,0,0,0,1},
			{1,0,0,0,1,0,0,1,0,1,1,0,1,0,0,1,0,0,0,1},
			{1,1,1,1,1,0,0,0,0,1,1,0,1,1,1,1,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,0,1},
			{1,2,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};
	
	int[] yx1 = {1,1};
	int[] yx2 = {8,18};
	
	Scanner scan = new Scanner(System.in);
	
	public void move() {
		view();
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			motion(scan.next());
			view();
			if (yx1[0] == 8 && yx1[1] == 1) {
				System.out.println("도착!");
				break;
			}
		}
	}
	
	public void view() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (i == yx1[0] && j == yx1[1]) {
					System.out.print(" S ");
				} else if (i == yx2[0] && j == yx2[1]) {
					System.out.print(" S ");;
				} else {
					if (map[i][j] == 1) {
						System.out.print(" ■ ");
					} else if (map[i][j] == 2) {
						System.out.print(" @ ");
					} else {
						System.out.print(" □ ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void motion(String motion) {
		switch (motion) {
		case "w": // 위로 이동
			yx1[0]--;
			break;
		case "s": // 아래로 이동
			yx1[0]++;
			break;
		case "a": // 왼쪽으로 이동
			yx1[1]--;
			break;
		case "d": // 오른쪽으로 이동
			yx1[1]++;
			break;
		default:
			System.out.println("방향을 다시 입력하세요: ");
			motion(scan.next());
			break;
		}
		
		if (map[yx1[0]][yx1[1]] == 1) {
			back(motion,yx1);
		} else {
			back(motion,yx2);
		}
	}
	
	public void back(String motion, int[] yx) {
		switch (motion) {
		case "w": // 위로 이동
			yx[0]++;
			break;
		case "s": // 아래로 이동
			yx[0]--;
			break;
		case "a": // 왼쪽으로 이동
			yx[1]++;
			break;
		case "d": // 오른쪽으로 이동
			yx[1]--;
			break;
		}
	}

}
