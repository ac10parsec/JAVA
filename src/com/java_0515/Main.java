package com.java_0515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dog? Cat?");
		String anny = scan.next();
		switch (anny) {
		case "Dog":
			TestInterface test = new Dog();
			test.say(anny);
			break;
		case "Cat":
			TestInterface test2 = new Cat();
			test2.say(anny);
			break;
		}
		
	}

}
