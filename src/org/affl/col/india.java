package org.affl.col;

public class india {
	
	 static int i = 20;
	
	public void m1() {
		
		int i = 10;
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public static void m2() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(i);
		india x = new india();
		x.m1();
		x.m2();
		india.m2();
		m2();
		
	}
}
