package com.java_0509;

public class Motion {

	public int[] mv(String motion, int ay, int ax) {
		switch (motion) {
		case "w":
			ay--;
			break;
		case "s":
			ay++;
			break;
		case "a":
			ax--;
			break;
		case "d":
			ax++;
			break;
		default: 
			System.out.println("잘못된 이동입니다!");
			break;
		}

		int[] yx = {ay,ax};
		return yx;
	}
}
