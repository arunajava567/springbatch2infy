package com.infosys.exceptions;

class MinimumDepositException extends RuntimeException{ //Throwable , Exception, RuntimeException
	MinimumDepositException(String msg) {
		super(msg);
		//System.out.println(msg);
		
	}
}
public class CustomDemo {
	public static void main(String[] args) // throws MinimumDepositException
	{
			int amount=999;
			if (amount<1000)
				 throw new MinimumDepositException("Minimum deposit amount is 1000/-");
			else
			  System.out.println(" Thanks for using services...");
	
	}

}
