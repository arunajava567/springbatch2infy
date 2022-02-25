package com.infosys.funcitonalinterface;

import java.util.function.Consumer;

@FunctionalInterface 
interface Arith{
	int oper(int  a,int  b,int c);
}


/*
void consumer(int x) {
	System.out.println(x);
}
*/
public class Demo1 {

	public static void main(String[] args) {

      Arith ar=( x, y,z)->  x+y+z ;
      System.out.println("sum="+ar.oper(4, 5,0));
      
      System.out.println("sum="+ar.oper(6,9,0));
      
      Arith ar1=(x,y,z)->x+y-z;
     
      System.out.println("difference="+ar1.oper(10, 5,3));
      
      
        Consumer<String> consumer= x-> System.out.println(x);
        
        consumer.accept("Welcome to Lambda Expression");
		
		/*
		 * Supplier<String> b=()->" Welcome to Supplier Lambda";
		 * System.out.println(b.get()); a.accept(b.get());
		 * 
		 * 
		 * Predicate<Integer> p=n->n%5==0; System.out.println(p.test(42));
		 * 
		 */
 	}
}
