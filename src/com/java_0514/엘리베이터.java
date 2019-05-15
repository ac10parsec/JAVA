package com.java_0514;

import java.util.Scanner;

public class 엘리베이터 {
	
	int[] box = new int[4]; // 탑승객 저장
	
	Scanner scan = new Scanner(System.in);
	
	int fnum;
	
	public void a1() {
		
		while (true) {
			boolean stop = false;
			int i = 1;
			while (i <= 5) {
				fnum = i;
				if (fnum > 3) {
					fnum = 6 - i;
				}
				
				getoff();
				
				if (motion(select())) {
					stop = true;
					break;
				}
				
				view();
				System.out.println();
				i++;
			}
			if (stop) {
				break;
			}
		}
	}
	
	public String select() {
		view();
		System.out.println("행동을 입력하세요.");
		System.out.println("1.이동  2.탑승  9.종료");
		String sel = scan.next();
		return sel;
	}
	
	public boolean motion(String sel) {
		boolean stop = false;
		int w, f;
		switch (sel) {
		case "1":
			f = move();
			w = get();
			if (w != 9) {
				box[w] = f;
			} else {
				System.out.println("엘리베이터 운행을 종료합니다.");
				stop = true;
			}
			break;
		case "2":
			w = get();
			f = move();
			if (w != 9) {
				box[w] = f;
			} else {
				System.out.println("엘리베이터 운행을 종료합니다.");
				stop = true;
			}
			break;
		case "9":
			System.out.println("엘리베이터 운행을 종료합니다.");
			stop = true;
			break;
		default:
			System.out.println("다시 입력하세요: ");
			motion(scan.next());
		}
		return stop;
	}
	
	public int move() {
		int f;
		System.out.println("몇층으로 가시겠습니까? [현재층: "+fnum+"]");
		f = Integer.parseInt(scan.next());
		if (f < 1 || f > 3) {
			System.out.println("다시 입력하세요: ");
			f = Integer.parseInt(scan.next());
		}
		return f;
	}
	
	public int get() {
		int w;
		System.out.println("어디에 탑승하시겠습니까? [취소: 9]");
		System.out.println(" [0]  [1]  [2]  [3] ");
		w = Integer.parseInt(scan.next());
		if (w > 3 && w < 9) {
			System.out.println("다시 입력하세요: ");
			w = Integer.parseInt(scan.next());
		} else if (w > 0 && w <= 3) {
			if (box[w] >= 1) {
				System.out.println("다시 입력하세요: ");
				w = Integer.parseInt(scan.next());
			}
		}
		return w;
	}
	
	public void getoff() {
		for (int i = 0; i < box.length; i++) {
			if (box[i] == fnum) {
				box[i] = 0;
			}
		}
	}
	
	public void view() {
		System.out.println("엘레베이터 상태 [현재층 : "+fnum+"]");
		for (int i = 0; i < box.length; i++) {
			if (box[i] >= 1) {
				System.out.print(" [■] ");
			} else {
				System.out.print(" [ ] ");
			}
		}
		System.out.println();
	}
	
}
