package com.java_0426;

public class 배열 {
	
	public void t1() {
		int a;    // 변수 선언
		int[] aa; // 배열 선언
		a = 1;
		
		aa = new int[5]; // 배열 생성 == 배열 aa의 공간 설정
		aa[0] = 1;
		
		int[] bb = new int[2]; // 배열 생성 & 크키 설정
		bb[0] = 0;			   // 배열 특정 위치에 값 담기
		bb[1] = 1;
		
		System.out.println(a);
		System.out.println(aa[1]); // 배열 특정 위치 값 출력
		System.out.println(bb);
	}
	
	public void t2() {
		int[] one = new int[9];
		one[0] = (1*1);
		one[1] = (1*2);
		one[2] = (1*3);
		one[3] = (1*4);
		one[4] = (1*5);
		one[5] = (1*6);
		one[6] = (1*7);
		one[7] = (1*8);
		one[8] = (1*9);
		// [1, 2, 3, 4, 5, 6, 7, 8, 9]
		//  0, 1, 2, 3, 4, 5, 6, 7, 8  << 위치값 (인덱스)
		
		System.out.println("1 * 5 = "+ one[4]);
	}
	
	public void t3() {
		int[] arr = new int[9];
		for(int i = 1; i <= 9; i++) { // 정수 배열에 데이터 값 담기 반복문 실행
			int ans = (1*i);
			arr[i-1] = ans;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("1 * "+(i+1)+" = "+arr[i]);
		}
	}
	
	public void t4() {
		String[] day = new String[7];
		day[0] = "일";
		day[1] = "월";
		day[2] = "화";
		day[3] = "수";
		day[4] = "목";
		day[5] = "금";
		day[6] = "토";
		
		// 일 > 화 > 목  > 토
//		for (int i = 0; i < day.length; i++) {
//			if (i%2 == 0) {
//				System.out.println(day[i]);
//			}
//		}
		
		for (int i = 0; i < day.length; i+=2) {
			System.out.println(day[i]);
		}
	}
	
	public void t5() {
		int[][] arr = new int[3][4];
		arr[0][0] = 5;
		arr[0][1] = 3;
		arr[1][2] = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void t6() {
		int[][] day = new int[5][7];
		// 현재 달의 달력 데이터를 요일 배열 데이터를 담아보세요.
		// 출력 오늘 요일을 표현 할 것.
		
		System.out.println("\t\t   *2019년 4월*");
		System.out.println("");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i <= day.length; i++) {
			for (int j = 0; j < 7; j++) {
				int d = i*7 + j;
				if (d <= 30) {
					day[i][j] = d;
					System.out.print(day[i][j]+"\t");
				} else {
					break;
				}
			}
			System.out.println();
		}
		System.out.println("Today: "+day[3][5]);
	}
	
	public void t7() {
		// 현재 달의 달력 데이터를 요일 배열 데이터를 담아보세요.
		// 출력 오늘 요일을 표현 할 것.
		
		String[] t = new String[7];
		t[0] = "월"; t[1] = "화"; t[2] = "수"; 
		t[3] = "목"; t[4] = "금"; t[5] = "토"; t[6] = "일";
		
		String[][] day = new String[7][5];
		for (int y = 0; y <day.length; y++) {// day.length; y++) {
			for (int x = 0; x < day[y].length; x++) {
				int z = x*7;	
				int d = y + z + 1;
				day[y][x] = (""+d);
				if (d <= 30) {
					System.out.print(t[y]+"(4월"+day[y][x]+"일)\t");
				} else {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		int a = 26;
		System.out.println("Today: "+t[a%7-1]);
	}

}
