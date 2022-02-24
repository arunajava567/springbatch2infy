package com.infosys.regex;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Course{
	String name;
	String module;
	int duration;
	/**
	 * @param name
	 * @param module
	 * @param duration
	 */
	Course() {}
	public Course(String name, String module, int duration) {
		super();
		this.name = name;
		this.module = module;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", module=" + module + ", duration=" + duration + "]";
	}
	
	
}

public class Regexdemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String exp="SEram01";
		
		String input=sc.nextLine();
		
		System.out.println(input.matches(exp)); //1
		
		System.out.println(Pattern.matches(exp,input));  //3
	
		Pattern p=Pattern.compile("a*b");   //2
		Matcher m=p.matcher("aaaaaab");
		System.out.println(m.matches());
		
		
		String s="InfosysUSer Chennai Tamilnadu India";
		
		String ss[]=s.split(" ");
		
		for(String s1: ss)
		   System.out.println(s1);	
		 
		String s5="Java j2se 3";
		StringTokenizer st=new StringTokenizer(s5);
		System.out.println(st.countTokens());
		Course c=null;
		while(st.hasMoreTokens()) {
			
			String name=st.nextToken();
			String module=st.nextToken();
			int duration=Integer.parseInt(st.nextToken());
			c=new Course(name,module,duration);
		}
		System.out.println(c);
		
	}

}
