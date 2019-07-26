package com.java_0726;

public class Move {
	
	public int[] go(String motion, int y, int x) {
		switch (motion) {
		case "w":
			y--;
			break;
		case "s":
			y++;
			break;
		case "a":
			x--;
			break;
		case "d":
			x++;
			break;
		default:
			System.out.println("잘못된 이동입니다!");
			break;
		}
		int[] head = {y, x};
		return head;
	}
	
	public int[] back(String motion, int y, int x) {
		switch (motion) {
		case "w":
			y++;
			break;
		case "s":
			y--;
			break;
		case "a":
			x++;
			break;
		case "d":
			x--;
			break;
		default:
			break;
		}
		int[] head = {y, x};
		return head;
	}
}
