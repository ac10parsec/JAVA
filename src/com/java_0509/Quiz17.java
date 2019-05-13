package com.java_0509;

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
	int length = 1;

	public void move() {
		earth[0][0] = 1; 
		earth[0][1] = 1;
		view();
		
		while (true) {
			System.out.print("방향을 입력하세요: ");
			
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
		switch (motion) {
		case "w": // 위로 이동
			
		}
	}
	
	

}
