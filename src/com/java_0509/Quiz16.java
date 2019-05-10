package com.java_0509;

import java.util.Scanner;

public class Quiz16 { // 출제자: 진현욱

	int[][] arr1 = {
			{8,7,6,5,4,3,1,9,2}, // y = 0
			{5,4,3,2,1,9,7,6,8}, // y = 1
			{2,1,9,8,7,6,4,3,5}, // y = 2
			{1,9,8,7,6,5,3,2,4}, // y = 3
			{4,3,2,1,9,8,6,5,7}, // y = 4
			{7,6,5,4,3,2,9,8,1}, // y = 5
			{3,2,1,9,8,7,5,4,6}, // y = 6
			{6,5,4,3,2,1,8,7,9}, // y = 7
			{9,8,7,6,5,4,2,3,1}  // y = 8
	};
	
	int[][] arr2 = {
			{8,0,6,0,0,3,0,9,0}, // y = 0
			{0,4,0,0,1,0,0,6,8}, // y = 1
			{2,0,0,8,7,0,0,0,5}, // y = 2
			{1,0,8,0,0,5,0,2,0}, // y = 3
			{0,3,0,1,0,0,0,5,0}, // y = 4
			{7,0,5,0,3,0,9,0,0}, // y = 5
			{0,2,1,0,0,7,0,4,0}, // y = 6
			{6,0,0,0,2,0,8,0,0}, // y = 7
			{0,8,7,6,0,4,0,0,3}  // y = 8
	};
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		int ya, xa, value;
		int sum = 0;
		while (true) {
			for (int y = 0; y < arr2.length; y++) {
				for (int x = 0; x < arr2[y].length; x++) {
					if (arr2[y][x] != 0) {
						System.out.print(" "+arr2[y][x]+" ");
					} else {
						System.out.print(" □ ");
					}
					sum += arr2[y][x];
					if (sum == 405) {
						System.out.println("끝!");
						break;
					}
				}
				System.out.println();
			}
			
			System.out.println("Enter Y axis: ");
			ya = Integer.parseInt(scan.next());
			System.out.println("Enter X axis: ");
			xa = Integer.parseInt(scan.next());
			System.out.println("Enter Value: ");
			value = Integer.parseInt(scan.next());
			
			if (arr1[ya-1][xa-1] == (value)) {
				arr2[ya-1][xa-1] = value;
				System.out.println("정답입니다.");
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
}
