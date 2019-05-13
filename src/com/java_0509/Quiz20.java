package com.java_0509;

import java.util.Scanner;

public class Quiz20 { // 출제자: 김수민

	int[][] map = {
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,1,0,0,1},
			{1,0,0,0,0,0,1,0,0,1},
			{1,0,0,0,1,0,1,0,0,1},
			{1,0,0,1,0,1,1,0,0,1},
			{1,0,0,0,0,1,1,0,0,1},
			{1,0,0,1,0,1,1,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}
	};
	
	int[][] blocks = {
			{2,4},{2,7},{5,2},{6,2},{7,4},{7,7}
	};
	
	int[] point = {1,1};
	
	Scanner scan = new Scanner(System.in);
	
	public void move() {
		view();
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			motion(scan.next());
			view();
		}
	}
	
	public void view() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				boolean check = true;
				for (int k = 0; k < blocks.length; k++) {
					if (i == blocks[k][0] && j == blocks[k][1]) {
						System.out.print(" @ ");
						check = false;
					}
				}
				
				if (check) {
					if (i == point[0] && j == point[1]) {
						System.out.print(" S ");
					} else {
						if (map[i][j] == 1) {
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
	
	public void motion(String motion) {
		switch (motion) {
		case "w": // 위로 이동
			point[0]--;
			break;
		case "s": // 아래로 이동
			point[0]++;
			break;
		case "a": // 왼쪽으로 이동
			point[1]--;
			break;
		case "d": // 오른쪽으로 이동
			point[1]++;
			break;
		default:
			System.out.println("방향을 다시 입력하세요: ");
//			motion(scan.next());
			break;
		}
		
		int f = -1;
		for (int i = 0; i < blocks.length; i++) {
			if (blocks[i][0] == point[0] && blocks[i][1] == point[1]) {
				f = i;
				switch (motion) {
				case "w": // 위로 이동
					blocks[i][0]--;
					break;
				case "s": // 아래로 이동
					blocks[i][0]++;
					break;
				case "a": // 왼쪽으로 이동
					blocks[i][1]--;
					break;
				case "d": // 오른쪽으로 이동
					blocks[i][1]++;
					break;
				}
			}
		}
		
		if (overlap()) {
			back(motion);
		}
		
		if (overlap2(f)) {
			back(motion);
			switch (motion) {
			case "w": // 위로 이동
				blocks[f][0]++;
				break;
			case "s": // 아래로 이동
				blocks[f][0]--;
				break;
			case "a": // 왼쪽으로 이동
				blocks[f][1]++;
				break;
			case "d": // 오른쪽으로 이동
				blocks[f][1]--;
				break;
			}
		}
	}
	
	
	public void back(String motion) {
		switch (motion) {
		case "w": // 위로 이동
			point[0]++;
			break;
		case "s": // 아래로 이동
			point[0]--;
			break;
		case "a": // 왼쪽으로 이동
			point[1]++;
			break;
		case "d": // 오른쪽으로 이동
			point[1]--;
			break;
		}
	}
	
	public boolean overlap() {
		boolean ovlap = false;
		
		if (map[point[0]][point[1]] == 1) {
			ovlap = true;
		}
		
		return ovlap;
	}
	
	public boolean overlap2(int find) {
		boolean ovlap = false;
		for (int i = 0; i < blocks.length; i++) {
			if (map[blocks[i][0]][blocks[i][1]] == 1) {
				ovlap = true;
			}
		}
		
		if (find > 0) {
			for (int i = 0; i < blocks.length; i++) {
				if (i != find) {
					if (blocks[i][0] == blocks[find][0] && blocks[i][1] == blocks[find][1]) {
						ovlap = true;
					}
				}
			}
		}
		
		return ovlap;
	}
	
}
