package com.infosys.oops;

interface  Loan{
	public static final int a=99;
	void getEmi(Double amount);	
	void disp();
}
interface Insurence{
	void getQuotation(double  amt);
}

class X implements Loan{
	public void getEmi(Double amount) {}	
	public void disp() {}
}
class Vehicle implements Loan,Insurence{
	public void disp() {
		
	}
	public void getEmi(Double amount) {
		System.out.println("Emi is :"+amount/10);
	}
	public void getQuotation(double  amt) {
		System.out.println(" 50000 with documents");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
