package com.java_0509;

import java.util.Scanner;

public class Tet {
	
	Scanner scan = new Scanner(System.in);
	
	int[][] frame = {
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
	
	int[][] block0 = { // ㄱ
			{1,1},{1,2},{1,3},{2,3}	
	};
	
	int[][] block1 = { // ㄴ
			{1,1},{2,1},{3,1},{3,2}	
	};
	
	int[][] block2 = { // ㅁ
			{1,1},{1,2},{2,1},{2,2}	
	};
	
	int[][] block3 = { // ㅣ
			{1,1},{2,1},{3,1},{4,1}	
	};
	
	public void tet() {
		String motion = "";
		
		while (true) {
			int[][] block = block2;
			view("", block);
			
			int next = 0;
			while (next < 1) {
				for (int n = 0; n < 2; n++) {
					System.out.print("방향을 입력하세요: ");
					motion = scan.next();
					block = move(motion,block);
					view(motion, block);
				}
				block = move("s",block);
				if (view(motion, block)) {
					next = 1;
				}
			}
			System.out.print("dd");
		}
	}
	
	public boolean view(String motion, int[][] block) {
		boolean next = false;
		boolean[] c = check(block);
		if (c[0] || c[1] || c[2] || c[3]) {
			next = true;
			
			if (block[0][1] != 0 && block[3][1] != 9) {
				for (int i = 0; i < block.length; i++) {
					int by = block[i][0];
					int bx = block[i][1];
					frame[by][bx] = 1;
				}
			}
			block = remove(motion, block);
		}
		
		for (int y = 0; y < frame.length; y++) {
			for (int x = 0; x < frame[x].length; x++) {
				
				
				
				
				boolean check = true;
				for (int i = 0; i < block.length; i++) {
					if (y == block[i][0] && x == block[i][1]) {
						System.out.print(" ♥ ");
						check = false;
					}
				}
				
				if (check) {
					if (frame[y][x] == 1) {
						System.out.print(" ■ ");
					} else {
						System.out.print(" □ ");
					}
				}
			}
			System.out.println();
		}
		return next;
	}
	
	public boolean[] check(int[][] block) { // 경계값 확인
		boolean[] c = new boolean[4];
		int[] by = {block[0][0],block[1][0],block[2][0],block[3][0]};
		int[] bx = {block[0][1],block[1][1],block[2][1],block[3][1]};
		
		for (int i = 0; i < by.length; i++) {
			if (frame[by[i]][bx[i]] == 1) {
				c[i] = true;
			} else {
				c[i] = false;
			}
		}
		return c;
	}
	
	public int[][] move(String motion, int[][] block) {
		switch (motion) {
//		case "w": // 모양 변경
//			
//			break;
		case "s": // 아래로 이동
			for (int i = 0; i < block.length; i++) {
				block[i][0] += 1;
			}
			break;
		case "a": // 왼쪽으로 이동
			for (int i = 0; i < block.length; i++) {
				block[i][1] -= 1;
			}
			break;
		case "d": // 오른쪽으로 이동
			for (int i = 0; i < block.length; i++) {
				block[i][1] += 1;
			}
			break;
		default:
			System.out.println("이동할 방향을 다시 입력하세요: ");
			move(scan.next(),block);
		}
		
		return block;
	}
	
	public int[][] remove(String motion, int[][] block) {
		switch (motion) {
		case "s": // 아래로 이동
			for (int i = 0; i < block.length; i++) {
				block[i][0] -= 1;
			}
			break;
		case "a": // 왼쪽으로 이동
			for (int i = 0; i < block.length; i++) {
				block[i][1] += 1;
			}
			break;
		case "d": // 오른쪽으로 이동
			for (int i = 0; i < block.length; i++) {
				block[i][1] -= 1;
			}
			break;
		}
		return block;
	}

}
