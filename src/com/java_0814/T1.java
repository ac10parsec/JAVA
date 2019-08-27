package com.java_0814;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class T1 {
	
	Scanner scan = new Scanner(System.in);
	CRUD crud = new CRUD();
	
	public void print() {
		System.out.println("T1 :D");
	}
	
	public void run() {
		System.out.println("Start CRUD program");
		boolean flag = true;
		while (flag) {
			System.out.println("[1]insert, [2]select, [3]update, [4]delete, [5]exit");
			switch(scan.next()) {
			case "1":
				System.out.print("Input value: ");
				crud.insert(scan.next());
				break;
				
			case "2":
				System.out.println("Index of select value: ");
				System.out.println(crud.select(Integer.parseInt(scan.next())));
				break;
				
			case "3":
				System.out.println("Index of update value: ");
				int index = Integer.parseInt(scan.next());
				System.out.println("Input value: ");
				crud.update(index, scan.next());
				break;
				
			case "4":
				System.out.println("Index of delete value: ");
				crud.delete(Integer.parseInt(scan.next()));
				break;
				
			case "5":
				System.out.println("End CRUD program :D");
				flag = false;
				break;
			}
		}
	}
}
