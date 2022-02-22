package com.infosys.string;

import java.util.Scanner;

class Course{
	Integer courseId;
	String courseName;
	public Course(Integer courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	
}

public class Arraydemo {

	public static void main(String[] args) {
		
		double x=1987.876789;
		double y=(double)Math.round(x*100)/100;
		System.out.println(x +"  "+y);

        Scanner sc=new Scanner(System.in);
		
		int[] b= {2,3,4,5,6,7,8};  //source
		int a[]=new int[3]; //destination
		
		System.arraycopy(b, 4, a, 0, 1);
		               //source, startlocationsrc,dest,destlocation,no elements

		for(int x1: a)
			System.out.print(x1+" ");
		
		/*
		Course courses[]=new Course[3];
		
		Course c1=new Course(10,"java");
		courses[0]=c1;
		Course c2=new Course(11,"java123");
		courses[1]=c2;
		Course c3=new Course(12,"java456");
		courses[2]=c3;
		System.out.println("For each==============");
		for( Course cobj: courses) 
			System.out.println(cobj.courseId+"  "+cobj.courseName);
		
		System.out.println("for loop==============");
		for(int i=0;i< courses.length;i++)
			System.out.println(courses[i].courseId+"  "+courses[i].courseName);
	
		
		
		int x[][]= {{2,3,4},{5,6},{1,2,3,4}};
		         // i  0        1      2
		         //j 0,1,2   0,1   0,1,2,3
		for(int i=0;i<x.length;i++) {
			
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
	}

}


