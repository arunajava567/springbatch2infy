package com.infy;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int a=sc.nextInt();  //sc.
		int b=sc.nextInt();
		int c=sc.nextInt();
        if (a>b)
        {	if(a>c)
        
        	System.out.println("a is big");
        	else
        		System.out.println("c is big");
        }
        
        else if(b>c)
        
        	System.out.println("b is big");
        else
        	System.out.println("c is big");
        
	}

}
