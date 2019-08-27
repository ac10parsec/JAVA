package com.java_0814;

import java.util.ArrayList;
import java.util.List;

public class CRUD {
	
	public List<Object> list = new ArrayList<Object>();
	
	public void insert(Object value) {
		list.add(value);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public Object select(int index) {
		return list.get(index);
	}
	
	public void update(int index, Object value) {
		System.out.print(list.get(index) + " >>> ");
		list.set(index, value);
		System.out.println(list.get(index));
	}
	
	public void delete(int index) {
		list.remove(index);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
