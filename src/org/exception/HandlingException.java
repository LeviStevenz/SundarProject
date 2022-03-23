package org.exception;

public class HandlingException {
	
	
	public static void main(String[] args) {
		
		System.out.println(100);
		System.out.println(100);
		
		try {
			System.out.println("OPEN");
		System.out.println(100/0);
		
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("CLOSE");
		}
		
		
		
		System.out.println(100);
		System.out.println(100);
	}

}
