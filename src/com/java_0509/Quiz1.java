package com.java_0509;

import java.util.Scanner;

public class Quiz1 { // 출제자: 노형래

	int[][] frame = {
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}
	};
	
	int[][] obs = {
			{1,1},{4,1},{7,1},{3,3},{6,3},{2,5},{5,5},
			{3,7},{6,7},{2,8},{3,8},{5,8},{6,8}
	};
	
	int[] yx = {8,4};
	
	Scanner scan = new Scanner(System.in);
//	String motion = "";
	
	public void move() {
		view();
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			if (go(scan.next())) {
				System.out.println("으앙 죽음ㅠㅠ");
				break;
			}
			view();
			
			
		}
	}
	
	public void view() {
		for (int i = 0; i < frame.length; i++) {
			for (int j = 0; j < frame[i].length; j++) {
				boolean check = true;
				for (int k = 0; k < obs.length; k++) {
					if (i == obs[k][0] && j == obs[k][1]) {
						System.out.print(" ■ ");
						check = false;
					}
				} 
				if (check) {
					if (i == yx[0] && j == yx[1]) {
						System.out.print(" ♥ ");
					} else {
						if (frame[i][j] == 1) {
							System.out.print(" ■ ");
						} else {
							System.out.print(" □ ");
						}
					}
				}
			}
			System.out.println();
		}
	}
	
	public boolean go(String motion) {
		boolean death = false;
		switch (motion) {
		case "a": // 왼쪽으로 이동
			yx[1] -= 1;
			break;
		case "d": // 오른쪽으로 이동
			yx[1] += 1;
			break;
		default:
			System.out.println("방향을 다시 입력하세요: ");
			go(scan.next());
			break;
		}
		
		if (frame[yx[0]][yx[1]] == 1) {
			back(motion);
		}
		
		for (int i = 0; i < obs.length; i++) {
			obs[i][0] += 1;
			if (obs[i][0] >= 9) {
				obs[i][0] -= 8;
			}
			
			if (obs[i][0] == yx[0] && obs[i][1] == yx[1]) {
				death = true;
			}
		}
		
		return death;
	}
	
	public void back(String motion) {
		switch (motion) {
		case "a": // 왼쪽으로 이동
			yx[1] += 1;
			break;
		case "d": // 오른쪽으로 이동
			yx[1] -= 1;
			break;
		
		}
	}
	
}
