package com.java_0726;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Worm {
	
	int[][] map = {
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,2,0,0,0,0,2,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,2,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,2,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,2,1},
			{1,0,0,0,2,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,0,1}
	};
	
	int y = 1; int x = 1;
	List<int[]> worm = new ArrayList<int[]>();
	
	Move move = new Move();
	Scanner scan = new Scanner(System.in);
	String motion = "";
	
	public void run() {
		int[] head = {y, x};
		worm.add(head);
		view();
		
		while (true) {
			move();
			view();
			
			if (map[y][x] == 2) {
				map[y][x] = 0;
				int[] temp = {y, x};
				for (int i = 0; i < worm.size() - 1; i++) {
					move();
					view();
				}
				worm.add(temp);
			}
			
			if (y == 9 && x == 8) {
				System.out.println("우왕 도착 :D");
				break;
			}
		}
	}
	
	public void move() {
		int[] head;
		
		System.out.print("방향을 입력하세요: ");
		motion = scan.next();
		head = move.go(motion, y, x);
		y = head[0]; x = head[1];
		
		if (map[head[0]][head[1]] == 1) {
			head = move.back(motion, y, x);
			y = head[0]; x = head[1];
		}
		
		if (worm.size() >= 2) {
			boolean flag = true;
			for (int i = 1; i < worm.size(); i++) {
				if (worm.get(i)[0] == y && worm.get(i)[1] == x) {
					head = move.back(motion, y, x);
					y = head[0]; x = head[1];
					flag = false;
				}
			}
			
			if (flag) {
				for (int i = worm.size() - 1; i > 0; i--) {
					worm.set(i, worm.get(i-1));
				}
			}
		}
		worm.set(0, head);
	}
	
	public void view() {
		int y, x;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				boolean flag = false;
				for (int k = 0; k < worm.size(); k++) {
					y = worm.get(k)[0]; x = worm.get(k)[1];
					if (i == y && j == x) {
						if (k == 0) {
							System.out.print(" @ ");
						} else {
							System.out.print(" ● ");
						}
						flag = true;
					}
				}
				
				if (flag == false) {
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
}
