package com.infosys.string;

public class Cargdemo {

	public static void main(String[] a) {
		
		System.out.println("name: "+a[0]);
		System.out.println("email: "+a[1]);
		System.out.println("mobile: "+a[2]);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		for( String s:a)
			System.out.println(s);
		
		
		
	}

}
