package com.infosys.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface   // annottaion @FunctionalInterface
interface MathOperation{
int operation(int a,int b);  //single method
}

@FunctionalInterface 
interface Message {
     String getMessage(String msg);
     //void show() ;
}
public class LambdaDemo  {
	public static void main(String[] args) {
		MathOperation m=(a,b)-> a+b;
		
		MathOperation s=(a,b)->a-b;
		List<Integer> l=Arrays.asList(56,34,56,45,24);
		
		l.forEach(x->System.out.println(x));//lambda
		
		l.forEach(System.out::println); //method reference
		
		
		System.out.println("Using lambda:"+m.operation(4, 5));
		System.out.println("Using lambda:"+m.operation(6, 5));
		
		/*Message m=  (x)-> x.toUpperCase() ;
		System.out.println(m.getMessage("Welcome to ImmersiveReactbatch-CG 2020"));
		*/
		
		Consumer<Double> a= x-> System.out.println(x/10);
		
		a.accept(500.00);
		
		
		Supplier<Double> b= () -> 456.78;
		a.accept(b.get());
		
		Predicate<Integer> p1= n->n%2==0;
		
		System.out.println(p1.test(21));
		
		
		
		
		}
		
	

}
