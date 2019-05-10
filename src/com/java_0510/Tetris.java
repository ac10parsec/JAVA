package com.java_0510;

import java.util.Scanner;

public class Tetris {
	
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
			{1,1,1,1,1,1,1,1,1,1}  // y = 14
	};
	
	
	
	Scanner scan = new Scanner(System.in);
	
	
	public void tet() {
		String motion;
		boolean flr;
		int num = 0;
		
		while (true) {
			int[][] block = blocks(num%4);
			if (death(block)) { // 죽음 처리
				System.out.println("으앙 쥬그뮤ㅠㅠ");
				break;
			}
			flr = floor(block);
			view(block,flr);
		
			while (true) {
				for (int i = 0; i < 2; i++) {
					System.out.print("방향을 입력하세요: ");
					motion = scan.next();
					block = move(motion,block);
					flr = floor(block);
					view(block,flr);
					if (flr) {
						break;
					}
				}
				block = move("s",block);
				flr = floor(block);
				view(block,flr); // 두번 이동하면 아래로 한 번 무조건 이동
				if (flr) {
					break;
				}
			}
			
			clear();
			num++;
		}
	}
	
	
	public boolean death(int[][] block) {
		boolean die = false;
		int ysize = block[3][0]; 
		int xsize = block[3][1];
		
		for (int y = 1; y <= ysize; y++) {
			for (int x = 1; x <= xsize; x++) {
				if (frame[y][x] == 1) {
					die = true;
				}
			}
		}
		
		return die;
	}
	
	
	public void clear() {
		for (int y = 13; y > 0; y--) {
			// find
			int sum = 0;
			for (int x = 1; x < 9; x++) {
				sum += frame[y][x];
			}
			
			
			// remove
			if (sum == 8) {
				for (int y2 = y; y2 > 1; y2--) {
					for (int x = 1; x < 9; x++) {
						frame[y2][x] = frame[y2-1][x];
					}
				}
				y++;
			}
		}
	}
	
	public void view(int[][] block, boolean flr) {
		for (int y = 0; y < frame.length; y++) {
			for (int x = 0; x < frame[y].length; x++) {
				boolean f = true;
				if (flr) {
					for (int i = 0; i < block.length; i++) {
						int by = block[i][0];
						int bx = block[i][1];
						frame[by][bx] = 1;
					}
				} else {	
					for (int i = 0; i < block.length; i++) {
						if (y == block[i][0] && x == block[i][1]) {
							System.out.print(" ♥ ");
							f = false;
						}
					}
				}
				if (f) {
					if (frame[y][x] == 1) {
						System.out.print(" ■ ");
					} else {
						System.out.print(" □ ");
					}
				}
			}
			System.out.println();
		}
	}
	
	
	public boolean floor(int[][] block) {
		boolean flr = false;
		for (int i = 0; i < block.length; i++) {
			int by = block[i][0] + 1;
			int bx = block[i][1];
			if (frame[by][bx] == 1) {
				flr = true;
			}
		}
		
		return flr;
	}
	
	
	public int[][] move(String motion, int[][] block) {
		switch (motion) {
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
		case "s": // 아래로 이동
			for (int i = 0; i < block.length; i++) {
				block[i][0] += 1;
			}
			break;
		default:
			System.out.println("방향을 다시 입력하세요: ");
			motion = scan.next();
			move(motion,block);
			break;
		}
		
		if (overlap(block)) {
			block = back(motion, block);
		}
		
		return block;
	}
	
	
	public int[][] back(String motion, int[][] block) {
		switch (motion) {
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
		case "s": // 아래로 이동
			for (int i = 0; i < block.length; i++) {
				block[i][0] -= 1;
			}
			break;
		}
		
		return block;
	}
		
	
	public boolean overlap(int[][] block) {
		boolean ovla = false;
		
		for (int i = 0; i < block.length; i++) {
			int by = block[i][0];
			int bx = block[i][1];
			if (frame[by][bx] == 1) {
			ovla = true;
			}
		}
		
		return ovla;
	}
	
	
	public int[][] blocks(int type) {
		int[][] block0 = { // ㄱ
				{1,1},{1,2},{1,3},{2,3}
		};
		
		int[][] block1 = { // ㄴ
				{1,1},{2,1},{2,2},{2,3}
		};
		
		int[][] block2 = { // ㅁ
				{1,1},{1,2},{2,1},{2,2}
		};
		
		int[][] block3 = { // ㅣ
				{1,1},{2,1},{3,1},{4,1}
		};
		
		int[][] block = new int[4][2];
		
		switch (type) {
		case 0:
			block = block0;
			break;
		case 1:
			block = block1;
			break;
		case 2:
			block = block2;
			break;
		case 3:
			block = block3;
			break;
		}
		
		return block;
	}

}
