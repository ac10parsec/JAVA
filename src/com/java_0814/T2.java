package com.java_0814;

import java.util.ArrayList;
import java.util.List;

public class T2 {

	public List<Object> list = new ArrayList<Object>(); 
	
	public void insert(Object value) {
		list.add(value);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println("=============");
	}
	
	public Object select(int index) {
		return list.get(index);
	}
	
	public void update(int index, Object value) {
		list.set(index, value);
		
	}
	
	public void delete(int index) {
		list.remove(index);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=============");
	}
	
}
