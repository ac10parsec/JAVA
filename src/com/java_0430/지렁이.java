package com.java_0430;

import java.util.Scanner;

public class 지렁이 {
	
	int[][] map = {
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,1,0}
	};
	
	int[] play = {1,1};
	int[][] tail = new int[6][2];
	int count = 0;
	int[] history = {1,1};
	int[][] food = {
			{2,2}, {2,7}, {4,5}, {6,2}, {6,8}, {8,4}	
	};
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		view();
		boolean stop = false;
		while (true) {
			boolean next = true;
			switch (scan.next().toUpperCase()) { // 이동 방향 입력
			case "W": // 위쪽
				play[0] = play[0] - 1;
				break;
			case "S": // 아래쪽
				play[0] = play[0] + 1;
				break;
			case "A": // 왼쪽
				play[1] = play[1] - 1;
				break;
			case "D": // 오른쪽
				play[1] = play[1] + 1;
				break;
			default:
				break;
			}
			
			if (next) {
				// 벽 예외 처리
				if(play[0] == 0) {
					play[0] = 1;
				} else if (play[1] == 0) {
					play[1] = 1;
				} else if (play[1] == 9) {
					play[1] = 8;
				} else if (play[0] == 9 && play[1] == 8) {
					stop = true;
				} else if (play[0] == 9) {
					play[0] = 8;
				}
			
				// 먹이 예외 처리
				for (int tar = 0; tar < food.length; tar++) {
					if (play[0] == food[tar][0] && play[1] == food[tar][1]) {
						tail[count][0] = tar + 1;
						tail[count][1] = 0;
						count++;
					}
				}
			
				if (count > 0) {
					// 먹이에 히스토리 적용
					for (int tar = count-1; tar >= 0; tar--) {
						int ori = tail[tar][0] - 1;
						if (tar == 0) {
							if (tail[tar][1] == 0) {
								tail[tar][1] = 1;
							} else {
								food[ori][0] = history[0];
								food[ori][1] = history[1];
							}
						} else {
							int beori = tail[tar-1][0] - 1;
							if (tail[tar][1] == 0) {
								tail[tar][1] = 1;
							} else {
								food[ori][0] = food[beori][0];
								food[ori][1] = food[beori][0];
							}
						}
					}
				}
			
				view();
			
				history[0] = play[0];
				history[1] = play[1];
			}
			
			if (stop) {
				System.out.println("End");
				break; // 게임 종료
			}
		}
	}
		
	public void view() {
		for (int row = 0; row < map.length; row++) {
			for (int col = 0; col < map[row].length; col++) {
				boolean check = true;
				if (play[0] == row && play[1] == col) {
					System.out.print(" ● ");
					continue; // 아래 건너뛰고 처음으로 돌아감
				}
				
				for (int tar = 0; tar < food.length; tar++) {
					for (int i = 0; i <= count; i++) {
						if (food[tar][0] == row && food[tar][1] == col) {
								System.out.print(" ○ ");
								check = false;
								break;
						}
					}
				}
								
				if (check) {
					if(map[row][col] == 0) {
						System.out.print(" ■ ");
					} else if (map[row][col] == 1) {
						System.out.print(" □ ");
					}
				}
			}
			System.out.println();
		}
	}

}
