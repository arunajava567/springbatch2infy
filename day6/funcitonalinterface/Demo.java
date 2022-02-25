package com.infosys.funcitonalinterface;


class A implements Loan{
	public double getEmi(double amount) {
		return 90.90;
	}
	public void show() {
		System.out.println(" clas sA default method");
	}
	void display() {
		Loan.super.show();
	}
}
class B implements Loan{
	public double getEmi(double amount) {
		return 56.90;
	}
	public void show() {
		Loan.super.show();
		System.out.println(" class B default method");
	}
}
public class Demo {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.getEmi(98888.90));
		a.show();
		Loan.staticshow();
		B b=new B();
		System.out.println(b.getEmi(98888.90));
		Loan.staticshow();
		b.show();
	}
}
