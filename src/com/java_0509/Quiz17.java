package com.java_0509;

import java.util.Scanner;

//import java.util.List;
//import java.util.ArrayList;

public class Quiz17 { // 출제자: 김주화
	
	int[][] map = {
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,2,0,0,0,0,2,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,2,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,2,0,0,0,0,0,2,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,2,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1}
	};
	
//	List<int[]> earth = new ArrayList<int[]>();
	
	int[][] earth = new int[7][2];
	int heady = 1; int headx = 1;
	int length = 1;

	Scanner scan = new Scanner(System.in);
	
	public void move() {
		earth[0][0] = 1; 
		earth[0][1] = 1;
		view();
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			go(scan.next());
			eat();
			view();
			
		}
	}
	
	public void view() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				boolean worm = false;
				for (int k = 0; k < length; k++) {
					if (i == earth[k][0] && j == earth[k][1]) {
						if (k == 0) {
							System.out.print(" @ ");
						} else {
							System.out.print(" ○ ");
						}
						worm = true;
					}
				}
				
				if (worm == false) {
					if (map[i][j] == 1) {
						System.out.print(" ■ ");
					} else if (map[i][j] == 2) {
						System.out.print(" ♥ ");
					} else {
						System.out.print(" □ ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void go(String motion) {
//		int heady = earth[0][0]; int headx = earth[0][1];
		switch (motion) {
		case "w": // 위로 이동
			heady--;
			break;
		case "s": // 아래로 이동
			heady++;
			break;
		case "a": // 왼쪽으로 이동
			headx--;
			break;
		case "d": // 오른쪽으로 이동
			headx++;
			break;
		default:
			System.out.println("방향을 다시 입력하세요: ");
			go(scan.next());
			break;
		}
		
		if (overlap() == false) {
			eat();
			for (int i = 5; i > 0; i--) {
				// 0 1 2 3 4 5 6
				earth[i+1][0] = earth[i][0];
				earth[i+1][1] = earth[i][1];
			}
			earth[0][0] = heady;
			earth[0][1] = headx;
		}
	}
	
	public boolean overlap() {
		boolean ovlap = false;
		
		if (map[heady][headx] == 1) {
			ovlap = true;
		}
		
		for (int i = 1; i < earth.length; i++) {
			if (earth[i][0] == heady && earth[i][1] == headx) {
				ovlap = true;
			}
		}
		
		return ovlap;
	}
	
	public void eat() {
		if (map[heady][headx] == 2) {
			map[heady][headx] = 0;
			earth[length][0] = heady;
			earth[length][1] = headx;
			length++;
			System.out.println("eat");
		}
		
	}

}
