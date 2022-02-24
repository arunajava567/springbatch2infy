package com.infosys.regex;

public class Regexdemo2 {

	public static void main(String[] args) {
		String exp1="([a-zA-Z0-9]+)"; 
		
		String emailexp="([a-zA-Z0-9-_]+)[@]([\\w]{5}+)[.](com|in)";
		System.out.println("arjun110".matches(exp1));
		System.out.println("abcR10@gmail.in".matches(emailexp));
		
		String x="Application";
		String y="Appcxxation";
		
		String exp2="App....tion";
		System.out.println(x.matches(exp2));
		System.out.println(y.matches(exp2));
		
		

	}

}
