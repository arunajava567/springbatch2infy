package com.infosys.string;

import java.util.StringTokenizer;

public class Stringdemo {

	public static void main(String[] args) {
		
		String s="Infosys-Chennai"; //literal   1  less memory
		
		String ss=new String("Infosys"); //object     2 more memory
		
		String s2="Infosys";
	    s2.replace("s","r");
		
		//immutable , create duplicates for many string operations
	    //memory wastage with duplicate objects
		
		System.out.println(s2.length());
		System.out.println(s2.toLowerCase());//1
		System.out.println(s2);//1
		System.out.println(s2.concat("-Pune"));//1
		System.out.println(s2);//1
		System.out.println(s2.startsWith("I"));//1
		System.out.println(s2.indexOf("f"));//1
	    System.out.println(s2.compareTo("Infosys"));
	    
	    char c[]=s2.toCharArray();
	
	    
	    System.out.println("infosys".equalsIgnoreCase("Infosys"));
	    
	    StringBuffer sb=new StringBuffer("Infosys");
	    //mutable, duplicate ojects not created, slow, synhcronized
	    //slow
	    System.out.println(sb.append("Technologies"));
	    System.out.println(sb.insert(3,"xxx"));
	    System.out.println(sb.delete(3,7));
	    System.out.println(sb.reverse());
	    System.out.println(sb.capacity());
	    sb.ensureCapacity(100);
	    
	    String sb1=sb.toString();
	    
System.out.println("infosys".equalsIgnoreCase("Infosys"));
	    
	    StringBuilder sb3=new StringBuilder("Infosys");
	    //mutable, duplicate ojects not created, slow, synhcronized
	    //slow
	    System.out.println(sb3.append("Technologies"));
	    System.out.println(sb3.insert(3,"xxx"));
	    System.out.println(sb3.delete(3,7));
	    System.out.println(sb3.reverse());
	    System.out.println(sb3.capacity());
	    sb3.ensureCapacity(100);
	    
	    String sb34=sb3.toString();
		
		
		String s6="IfosysUser-IT-Chennai-Tamilnadu-India";
		
		String s6s[]=s6.split("-");
		
		for(String s7:s6s)
			System.out.println(s7);
		
		
		StringTokenizer st=new StringTokenizer(s6,"-");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		

	}

}
