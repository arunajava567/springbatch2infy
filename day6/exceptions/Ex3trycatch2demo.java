package com.infosys.exceptions;

public class Ex3trycatch2demo {

	public static void main(String[] args) {

		
		//try - multi catch
		//try - catch-finally
		//try - nested try catch
		
		try {
			try {
				int x[] = { 4, 5, 6 };

				System.out.println(x[4]);
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			int y = 20 / 0;

			System.out.println(y);
			
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
