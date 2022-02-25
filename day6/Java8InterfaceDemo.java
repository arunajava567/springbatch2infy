package com.infosys;
@FunctionalInterface   //single abstract method
interface Arith{
	
	public int calc(int a,int b);  //+ - * /
	
}
/*
class AithImpl implements Arith {
	public int calc(int a,int b) {
		return a+b;
	}
}
*/
interface Vehicle {
	
	int speed();
	double milage();
	
	default void show() {
		System.out.println(" default methods");
	}
	static void disp() {
		System.out.println("java8 static method");
	}
}
interface Loan{
	
	int getEmi() ;
	default void show() {
		System.out.println(" default methods");
	}
}
class Car implements Vehicle,Loan{
	public int getEmi() {return 5;}
	public int speed() { return 9;}
	public double milage() {return 8.90;}
	public void show() {
		Loan.super.show();  //loan
		Vehicle.super.show(); //vehicle
		Vehicle.disp();
		System.out.println(" default methods");
	}
}
public class Java8InterfaceDemo {
	public static void main(String[] args) {
		Vehicle.disp();
		Arith airth=(a,b)->a*b;
		System.out.println(airth.calc(5,6));
		Arith airth1=(a,b)->a-b;
		System.out.println(airth1.calc(53,6));
	
	}

}
