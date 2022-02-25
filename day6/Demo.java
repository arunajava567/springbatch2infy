package com.infosys;

import static com.infosys.model.Customer9.*;

import java.util.LinkedList;
import java.util.Queue;

//static imports

public class Demo {
	
	public static void main(String[] args) {//JVM
		
		
		Queue<Object> q=new LinkedList<Object>();
		
		try
		{
		    String s = null;
		    System.out.println(s.length());   //This statement throws NullPointerException
		}
		catch(NullPointerException ex)
		{
		    System.out.println("NullPointerException is caught here");
		 
		    throw ex;     //Re-throwing NullPointerException
		}
	}

}
