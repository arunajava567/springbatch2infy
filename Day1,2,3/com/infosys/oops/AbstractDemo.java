package com.infosys.oops;

abstract class Banking{  //abstract class
	
	abstract void deposit(double amount); //no logic , no body
	abstract double withdraw(double amount);//no body  - abstdact methods
	void show() {
		System.out.println(" Concrete method");
	}
}

class SavingBanking extends Banking {
	Double balance;
	SavingBanking(){
		this.balance=10000.00;
	}
	 void deposit(double amount) {
		 this.balance+=amount;
	 }
	 double withdraw(double amount) {
		 this.balance-=amount;
		 return this.balance;
	 }
	 double getBalance() {
		 return this.balance;
	 }
}
class CurrentAccountBanking extends Banking {
	Double balance;
	CurrentAccountBanking(){
		this.balance=50000.00;
	}
	 void deposit(double amount) {
		 this.balance+=amount+10;
	 }
	 double withdraw(double amount) {
		 this.balance-=amount;
		 return this.balance-10;
	 }
}
public class AbstractDemo {

	public static void main(String[] args) {
		
	   // Banking b;
	    
    	SavingBanking sb=new SavingBanking();
		
	//	b=sb;
    	
		Banking b=new SavingBanking();
		
		b.deposit(5000.00);
		System.out.println(sb.getBalance());
		b.withdraw(3000.00);
		System.out.println(sb.getBalance());
		
		
		
	}

}
