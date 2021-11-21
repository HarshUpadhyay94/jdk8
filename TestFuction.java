package com.raystech.jdk;

public class TestFuction {
	public static void main(String[] args) {
	
		FuncInterface n= (a, b) -> {
			System.out.println(a+b);
		}; n.add(6, 9);
		
		
	// FuncInterface t = (int a, int b) -> (a+b);
	// System.out.println(t.add(9, 9));
		
		
//		FuncInterface t = new FuncInterface() {
//
//			@Override
//			public void add(int a, int b) {
//				System.out.println(a+b);
//			}
//			
//		}; t.add(51, 50);
//		t.def();
//		FuncInterface.st();
		
	
	}
}