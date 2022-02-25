package com.infosys.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Ex2trycatchdemo {

	public static void main(String[] args) {
		//db
		FileReader fr=null;
		try {
			//db
			int x=10/0;
			fr=new FileReader("e:\\demo.java");
			try {
				
			}
			catch(Exception e1) {
				
			}
		}
		catch (ArithmeticException e) {
			//System.out.println(e);
			//e.printStackTrace();
				try {
				
			}
			catch(Exception e1) {
				
			}
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			
		}
		finally { //optional  , release resouces db,file,object
			// exception raised , not raised , eithercase finally is closed
		//db.close();
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Thank you");

	}

}
;