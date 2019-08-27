package com.java_0816;

public class PushPop {
	
	int[] list = new int[8];
	int size = 0;
	
	public void push(int num) {
		if (size < 8) {
			list[size++] = num;
		} else {
			System.out.println("overflow");
		}
	}
	
	public int pop() {
		int lastValue;
		if (size > 0) {
			lastValue = list[--size];
		} else {
			System.out.println("underflow");
			lastValue = -999;
		}
		return lastValue;
	}
}