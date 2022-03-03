package com.infy;

public class Arith {
	
	public int add(int a,int b) { //BL need to be tested 
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}

	public Boolean check(int a) {
		Boolean flag=false;
		if (a>10)
			flag= true;
		return flag;
	}
	
}
