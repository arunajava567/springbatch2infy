package com.infosys.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Ex5trycatchdemo {

	public static void main(String[] args) {
//java7 try-with resource
//no need of finally{}
	//	FileReader fr=null;
		try(FileReader fr=new FileReader("e:\\demo.java"))
		{
			
		}
		catch(IOException | ArithmeticException  e) {
			//multi catch block
		}
		

	}

}
