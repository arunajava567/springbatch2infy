package com.infy;

import java.util.Scanner;

public class RelationalDemo {

	public static void main(String[] args) {
	
		int a=100,b=280;
		if(a<b)
			System.out.println(" a is small");
		else
			System.out.println("b is small");
		
	int r=  (a>b)? a:b;
	System.out.println(r);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int input=sc.nextInt();  //sc.
	
	System.out.println(input);
	System.out.println(input+=10);  //input=input+10
	System.out.println(input-=10); //input=input-10;
	System.out.println(input*=10);
	System.out.println(input/=10);
	
	//int x=(a+b*c)/d+e;



	}
		
		
		

	}


