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
	
	int[] head = {1,1};
	List<int[]> worm = new ArrayList<int[]>();
	
	Move move = new Move();
	Scanner scan = new Scanner(System.in);
	String motion = "";
	
	public void run() {
		worm.add(head);
		view();
		
		while (true) {
			move();
			view();
			
			if (map[head[0]][head[1]] == 2) {
				eat();
			}
			
			if (head[0] == 9 && head[1] == 8) {
				System.out.println("우왕 도착 :D");
				break;
			}
		}
	}
	
	public void move() {
		System.out.print("방향을 입력하세요: ");
		motion = scan.next();
		head = move.go(head, motion);
		
		if (map[head[0]][head[1]] == 1) {
			head = move.back(head, motion);
		}
		
		if (worm.size() >= 2) {
			for (int i = worm.size() - 1; i > 0; i--) {
				worm.get(i)[0] = worm.get(i-1)[0];
				worm.get(i)[1] = worm.get(i-1)[1];
			}
			worm.get(0)[0] = head[0];
			worm.get(0)[1] = head[1];
		}
		
		
		
	}
	
	public void eat() {
		int[] temp = {head[0], head[1]};
		move();
		worm.add(temp);
		view();
		map[head[0]][head[1]] = 0;
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
							System.out.print(" ○ ");
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
