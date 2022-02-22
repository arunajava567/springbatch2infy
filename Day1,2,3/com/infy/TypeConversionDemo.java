package com.infy;

public class TypeConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		float b=20.89f;
		float result= a+b;
		
		int  x=10;  //byte-short-int-long-float- double
		
		double y=x;  // widening , upcasting lower to higher,implicit
		
		double x1=6567.789;
		
		int y1=(int)x1; //downcasting, narrowing , explicit
		
		System.out.println(x+ " "+y);
	}

}
