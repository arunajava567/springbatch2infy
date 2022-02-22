package com.infy;

import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();  //sc.
	int b=sc.nextInt();  //sc.
	char op=sc.next().charAt(0);  //+ ,- , * /
	switch(op) 
	{
	case '+':
			{System.out.println(a+b);break ;}
	default: 
		System.out.println("Wrong operator");
	case '-':{
		System.out.println(a-b);break;}
	case '*':{
		System.out.println(a*b);break;}
	case '/':{
		System.out.println(a/b);break;}
	
	}
	System.out.println("enter course name");
	String course=sc.next();
	switch(course) {
	case "java":
	{System.out.println("Platform Independent");break ;}

	case "testing":{System.out.println("QA");break;}

	default: 
		System.out.println("Wrong Course");
	}
	
	}

}
