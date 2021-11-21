package com.raystech.jdk;

public class TestAnnot {
	public static void main(String[] args) {
		
	
	Annotation a = new Annotation() {

		@Override
		public void show() {
			System.out.println("show");
		}
		@Override
		public void show1() {

			System.out.println("show1");
		}
		@Override
		public void show2() {

			System.out.println("show2");
		}
		@Override
		public void show3() {

			System.out.println("show3");
		}		
		
	}; a.show();
	a.show1();
	
}

}
