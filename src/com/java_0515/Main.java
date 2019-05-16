package com.java_0515;

import java.util.Scanner;

public class Main {

	public void call(TestInterface test) {
		System.out.println(test.say());
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dog? Cat?");
		String animal = scan.next();
		switch (animal) {
		case "Dog":
			main.call(new Dog());
			break;
		case "Cat":
			main.call(new Cat());
			break;
		}
		
	}

}
