package com.java_0429;

import java.util.Scanner;

public class Game {
	
	public void t2() {
		//boolean result = false;
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
		
		for (int y = 0; y < table.length; y++) {
			for (int x = 0; x < table[y].length; x++) {
//				if (y == ay0 && x == ax0) {
//					System.out.print(" ■ ");
//				}
				if (table[y][x] == 1) {
					System.out.print(" ■ ");
				} else {
					System.out.print(" □ ");
				}
			}
			System.out.println("");
		}
		
		
	}
	
	public void t3() {
		// 초기값 설정
		int[][] block = {
				{1,1,1,2,1,3,2,3}, // ㄱ
				{1,1,2,1,2,2,2,3}, // ㄴ
				{1,1,1,2,2,1,2,2}  // ㅁ
		};
		
		int ax1,ax2,ax3,ax4; int ay1,ay2,ay3,ay4;
		int bx1,bx2,bx3,bx4; int by1,by2,by3,by4;
		
		int type = 0;
		ax1=block[type][0]; ay1=block[type][1];
		ax2=block[type][2]; ay2=block[type][3];
		ax3=block[type][4]; ay3=block[type][5];
		ax4=block[type][6]; ay4=block[type][7];
		
		bx1=ax1; bx2=ax2; bx3=ax3; bx4=ax4;
		by1=ay1; by2=ay2; by3=ay3; by4=ay4;
		
		
		
		
		
		
		
		
		
	}
}
		

	
