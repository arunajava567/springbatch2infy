package com.infosys.exceptions;

public class Ex4trycatchdemo {

	public static void main(String[] args) {

		
		
		try {
			
				int x[] = { 4, 5, 6 };

				System.out.println(x[2]);
			
			int y = 20 / 5;

			System.out.println(y);
			
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
