package com.java_0816;

public class RunStack {
	
	public void run() {
		
		PushPop pp = new PushPop();
		
		pp.push(1); // 1
		pp.push(2); // 1 2
		System.out.println(pp.pop()); // 1		
		pp.push(3); // 1 3
		pp.push(4); // 1 3 4
		System.out.println(pp.pop());		
		System.out.println(pp.pop());
		pp.push(5);
		pp.push(6);
		pp.push(7);
		pp.push(8);
	}
	
}
