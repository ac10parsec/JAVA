package com.java_0509;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 지렁이 {
	public static void main(String[] args) {
		지렁이 렁이 = new 지렁이();
		렁이.control();
	}

	int[][] map = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1, 1, 1, 1, 0 }, { 0, 1, 2, 1, 1, 1, 1, 2, 0 },
			{ 0, 1, 1, 1, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 2, 1, 1, 0 }, { 0, 1, 1, 1, 1, 1, 1, 1, 0 },
			{ 0, 1, 2, 1, 1, 1, 1, 2, 0 }, { 0, 1, 1, 1, 2, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0, 3, 0 }, };
	int x = 1;
	int y = 1;
	int bX = 1;
	int bY = 1;
	int count = 0;
	List<int[]> listExample = new ArrayList<int[]>();

	public void control() {

		System.out.println("지렁이 게임 시작");
		int[] a = new int[2];
		a[0] = 1;
		a[1] = 1;
		listExample.add(a);
		listExample.add(a);
		print();
		Scanner scan = new Scanner(System.in);

		while (true) {
			switch (scan.next().toUpperCase()) {
			case "W":
				x--;
				break;
			case "S":
				x++;
				break;
			case "A":
				y--;
				break;
			case "D":
				y++;
				break;
			default:
				System.out.println("잘못된 값 입력");
				break;
			}

			setHead(); // 옳지 않을때 뒤에값도 해줘야함
			checkEat(); // 먹었을때 밀어줘야함
			print(); // 프린트시 여러개 있을때 예외처리
			if (map[listExample.get(0)[0]][listExample.get(0)[1]] == 3 && count == 6) {
				System.out.println("게임 끝!");
				print();
				break;
			}
			System.out.println("먹은 양 =" + count);
		}
	}

	public void setHead() {
		int[] b = new int[2];
		b[0] = x;
		b[1] = y;

		if (map[x][y] == 0 || (map[x][y] == 3 && count != 6)) {
			x = bX;
			y = bY;
			b[0] = x;
			b[1] = y;
			listExample.set(0, b);
		} else {
			bX = x;
			bY = y;
			listExample.set(0, b);
			for (int i = listExample.size() - 1; i > 0; i--) {
				System.out.println(listExample.size());
				listExample.get(i)[0] = listExample.get((i - 1))[0];
				listExample.get(i)[1] = listExample.get((i - 1))[1];

			}
		}
	}

	public void checkEat() {
		if (map[x][y] == 2) {
			int[] b = new int[2];
			b[0] = x;
			b[1] = y;
			map[x][y] = 1;
			listExample.add(b);
			count++;
		}
	}

	public void print() {
		boolean flag = false;
		boolean flagHead = false;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				flag = false;
				flagHead = false;
				for (int k = 0; k < listExample.size(); k++) {
					if (map[listExample.get(k)[0]][listExample.get(k)[1]] == 1 && i == listExample.get(k)[0]
							&& j == listExample.get(k)[1]) {
						flag = true;
						if (k == 0) {
							flagHead = true;
						}
					}
				}
				if (flag && flagHead) {
					System.out.print(" ® ");
				} else if (flag) {
					System.out.print(" ● ");
				} else {
					if (map[i][j] == 0) {
						System.out.print(" ■ ");
					} else if (map[i][j] == 1) {
						System.out.print(" □ ");
					} else if (map[i][j] == 2) {
						System.out.print(" ♥ ");
					} else {
						System.out.print(" □ ");
					}
				}
			}
			System.out.println("");
		}

	}

}