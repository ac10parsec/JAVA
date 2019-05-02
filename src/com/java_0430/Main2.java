package com.java_0430;

public class Main2 extends Method{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 오버로딩
		Method method = new Method();
		method.A();
		method.A(2);
		method.A("1");
		
		// 오버라이딩 // 상속 // 상속받은 대상이 static 되어 있어야 함
		A(false); 
		
	}
	
	static int a;
	
	public static void A(boolean a) {
		System.out.println("Main2 A() 호출");
	}

}
