package com.java_0430;

import java.util.Scanner;

public class 테트리스 {
	
	int[][] table = {
			{1,1,1,1,1,1,1,1,1,1}, // y = 0
			{1,0,0,0,0,0,0,0,0,1}, // y = 1
			{1,0,0,0,0,0,0,0,0,1}, // y = 2
			{1,0,0,0,0,0,0,0,0,1}, // y = 3
			{1,0,0,0,0,0,0,0,0,1}, // y = 4
			{1,0,0,0,0,0,0,0,0,1}, // y = 5
			{1,0,0,0,0,0,0,0,0,1}, // y = 6
			{1,0,0,0,0,0,0,0,0,1}, // y = 7
			{1,0,0,0,0,0,0,0,0,1}, // y = 8
			{1,0,0,0,0,0,0,0,0,1}, // y = 9
			{1,0,0,0,0,0,0,0,0,1}, // y = 10
			{1,0,0,0,0,0,0,0,0,1}, // y = 11
			{1,0,0,0,0,0,0,0,0,1}, // y = 12
			{1,0,0,0,0,0,0,0,0,1}, // y = 13
			{1,1,1,1,1,1,1,1,1,1}, // y = 14
		};
	
	int[][] block1 = { // ㄱ
			{1,1}, {1,2}, {1,3}, {2,3}	
	};
	int[][] block2 = { // ㄴ
			{1,1}, {2,1}, {2,2}, {2,3}
	};
	int[][] block3 = {
			{1,1}, {1,2}, {2,1}, {2,2}
	};
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		
		int type = 0;
		int[][] block = blocks(type);
		
		view(block);
		while (true) {
			switch (scan.next()) {
			case "a": // 왼쪽으로 이동
				for (int i = 0; i < block.length; i++) {
					block[i][0] = block[i][0] + 1; // y
					block[i][1] = block[i][1] - 1; // x
				}
				break;
			case "d": // 오른쪽으로 이동
				for (int i = 0; i < block.length; i++) {
					block[i][0] = block[i][0] + 1; // y
					block[i][1] = block[i][1] + 1; // x
				}
				break;
			case "s": // 아래로만 이동
				for (int i = 0; i < block.length; i++) {
					block[i][0] = block[i][0] + 1; // y
					block[i][1] = block[i][1];     // x
				}
				break;
			}
			view(block);
		}
	}
	
	public int[][] blocks(int type) {
		int[][] block = new int[4][2];
		switch (type) {
		case 0:
			block = block1;
			break;
		case 1:
			block = block2;
			break;
		case 2:
			block = block3;
			break;
		}
		return block;
	}
		
//	public int[][] move(int[][] block) {
//		
//		return 
//	}
	
	public void view(int[][] block) {
		for (int y = 0; y < table.length; y++) {
			for (int x = 0; x < table[y].length; x++) {
				boolean check = true;
			
				for (int i = 0; i < block1.length; i++) {
					if (block[i][0] == y && block[i][1] == x) {
						System.out.print(" ● ");
						check = false;
						break;
					}
				}
				
				if (check) {
					if (table[y][x] == 1) {
						System.out.print(" ■ "); 
					} else if (table[y][x] == 0) {
						System.out.print(" □ ");
					}
				}
			}
			System.out.println();
		}
	}

}
