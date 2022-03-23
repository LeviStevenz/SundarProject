package org.variable;

public class Variables {
	
	 static int i = 20;
	
	public void gas () {
		int i = 15;
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public  static void fig () {
		System.out.println(i);
		
		}
	
	public static void main(String[] args) {
		System.out.println(i);
		fig();
	}
	

}
