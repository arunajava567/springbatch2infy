package com.infosys.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class A{
	void disp() throws InterruptedException,IOException
	{
		//Thread.sleep(500);
	}
	
}
//overriden method can throw only the exceptions thrown by superclass method
class B  extends A{
   void disp()  throws FileNotFoundException
   {
	   //Thread.sleep(500);
	}
}

public class Ex1throwsdemo {

	static void show() throws IOException,InterruptedException {
		FileReader fr=new FileReader("e:\\abc.java");
		Thread.sleep(500);
	}
	public static void main(String[] args) //throws IOException,InterruptedException 
	{
		
		show(); //exception propagation

	}

}
