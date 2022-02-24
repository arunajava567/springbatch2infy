package com.infosys.enumapps;
enum days {
	monday(1),tuesday(2),wednesday(3),thursday(4),friday(5),saturday(6),sunday(0);
	private  int n;
	private days(int n) {
		this.n = n;
	}
    public int getN() {
		return n;
	}
	int showIndex() {
		return this.n;
	}
}
enum size {
	small(500),medium(1000),large(1500);
	private  int n;
	private size(int n){
		this.n=n;
	}
	public int getN() {
		return this.n;
	}
	int getPrice() {
		return this.n;
	}
}

public class Enumdemo {
	public static void main(String[] args) {
	days  day=days.monday;
	if(day.equals(days.monday))
	{		System.out.println("yes");
	}
	System.out.println("enum values of day");
	for( days d:days.values()) {
		System.out.println(d+"  "+d.ordinal()+d.showIndex());
	}
	System.out.println("list of bag with price");
	for( size d:size.values()) {
		System.out.println(d+"  "+d.ordinal()+"  "+d.getPrice());
	}
	size s=size.small;
	switch( s) {
	case small :{System.out.println("small bag");break;}
		
	case medium:{System.out.println("m bag");break;}
		
	case large:{System.out.println("big bag");break;}
		default:System.out.println("Wrong option");
	}
	}
	
//	String s=new String("java");  //hashcollision
//	Person p1=new Person();
//	Person p1=new Person();
	
//equals() & hashcode()
}
