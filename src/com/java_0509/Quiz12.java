package com.java_0509;

import java.util.Scanner;

public class Quiz12 {
	
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
	
	public void tet() {
		String motion = "";
		int num = 0;
		
		while (true) {
			int[][] block = blocks(num%4);
			if (death(block) == false) { // 죽음 처리
				System.out.println("으앙 쥬그뮤ㅠ");
				break;
			}
			view("",block); // 안 죽으면 출력
			
			while (true) {
				for (int m = 0; m < 2; m++) {
					System.out.print("이동할 방향을 입력하세요: "); 
					motion = scan.next(); // 이동 방향 입력 받음
					block = move(motion,block); // 입력 받은 방향으로 이동
					if (view(motion,block)) {
						break;
					}
				}
				block = move("s",block);
				block = box("s",block);
				if (view("s",block)) {
					break;
				}
			}

			clear();
			num++;
		}
	}
	
	public boolean view(String motion, int[][] block) {
		boolean next = false;
		for (int y = 0; y < frame.length; y++) {
			for (int x = 0; x < frame[y].length; x++) {
				boolean[] c = check(frame,block); 
				
				if (c[0] || c[1] || c[2] || c[3]) { // 블럭이 프레임에 닿으면 이동 취소
					block = remove(motion, block);
					next = true;
				}
				
				boolean check = true;
				for (int i = 0; i < block.length; i++) {
					if (block[i][0] == y && block[i][1] == x) {
						System.out.print(" ● ");
						check = false;
						break;
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
	
	public int[][] box(String motion, int[][] block) {
		boolean[] c = check(frame,block);
		int yy = block[3][0]; int xx = block[3][1];
		if (frame[yy+1][xx] == 1) {
			block = remove(motion,block);
			for (int i = 0; i < block.length; i++) {
				int by = block[i][0];
				int bx = block[i][1];
				frame[by][bx] = 1;
			}
		}
		return block;
	}

	public int[][] blocks(int type) {
		int[][] block = new int[4][2];
		
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
		
		switch (type) {
		case 0:
			block = block0; // ㄱ
			break;
		case 1:
			block = block1; // ㄴ
			break;
		case 2:
			block = block2; // ㅁ
			break;
		case 3:
			block = block3;
			break;
		}

		return block;
	}
	
	public boolean[] check(int[][] frame, int [][] block) {
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
	
	public void clear() {
		for (int y = 13; y > 0; y--) {
			// find
			int find = 0;
			for (int x = 1; x < 9; x++) {
				find += frame[y][x];
			}
			
			// clear & down
			if (find == 8) {
				for (int y2 = y; y > 0; y--) {
					for (int x = 1; x < 9; x++) {
						frame[y2][x] = frame[y2-1][x];
					}
				}
			}
		}
	}
	
	public boolean death(int[][] block) {
		boolean life = true;
		
		int ysize = block[3][0];
		int xsize = block[3][1];
		
		for (int y = 1; y <= ysize; y++) {
			for (int x = 1; x <= xsize; x++) {
				if (frame[y][x] == 1) {
					life = false;
				}
			}
		}
		
		return life;
	}
	
}
