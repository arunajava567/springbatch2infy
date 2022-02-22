package com.infy;

import java.util.Scanner;

public class Whiledemo {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter any number");
//		int a=sc.nextInt();  //sc.
//		for(int i=1;i<=a;i++)
//			System.out.println(i);
//		
////		int i=1;
////		
////		do {  //n  pre conditional 
////			System.out.println(i);
////			i++;
////			
////		}while( i<=a);  //post conditional 
//System.out.println("loop ended");
//
      int[] marks= {23,46,78,98,67,87,88,98};
//      
//      int s=0;
//      for(int i=0;i<marks.length;i++)
//    	  {if(i==4-1)  
//    	   System.out.println("4th index value:"+ marks[i]);
//    	   s+=marks[i];
//    	  }
//System.out.println("sum:"+s);
//      
//System.out.println(" For each loop");
//
for(int x : marks)
	
	System.out.println(x);


for(int i=1;i<=20;i++)
{  if(i==5)
	break;
	System.out.println(i);
}
	}

}
