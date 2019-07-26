package com.java_0726;

public class Move {
	
	public int[] go(int[] position, String motion) {
		switch (motion) {
		case "w":
			position[0]--;
			break;
		case "s":
			position[0]++;
			break;
		case "a":
			position[1]--;
			break;
		case "d":
			position[1]++;
			break;
		default:
			System.out.println("잘못된 이동입니다!");
			break;
		}
		return position;
	}
	
	public int[] back(int[] position, String motion) {
		switch (motion) {
		case "w":
			position[0]++;
			break;
		case "s":
			position[0]--;
			break;
		case "a":
			position[1]++;
			break;
		case "d":
			position[1]--;
			break;
		default:
			break;
		}
		return position;
	}
}
