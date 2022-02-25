package com.infosys.funcitonalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		Consumer<Integer> consumer= x -> System.out.println(x);
		consumer.accept(99);
		
		Supplier<String> b=()-> " Welcome to Supplier Lambda";
		System.out.println(b.get()); 
		
		Predicate<Integer> p=   n->n%5==0; 
		
		System.out.println(p.test(40));
		
		Function<Long,Long> add=new Add();
		Long result=add.apply(50l);
		System.out.println(result);
	}
}
class Add implements Function<Long,Long> {
	public Long apply(Long a) {
		return a+999;
	}
}