package com.infosys.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
@FunctionalInterface
interface MathOperation1 {
	int operation(int a,int b);
}
public class LamdaDemo1 {
	public static void main(String[] args) {
		System.out.println(m.operation(5, 6));
		MathOperation1 madd=(x,y)->x+y;   //->
		System.out.println(madd.operation(9,8));
			MathOperation1 msub=(x,y)->x-y; 
		System.out.println(msub.operation(9,8));
		Consumer<String> a= x->System.out.println(x);
		a.accept("Welcome to Lambda Expression");
		Supplier<String> b=()->" Welcome to Supplier Lambda";
		System.out.println(b.get());
		a.accept(b.get());
		Predicate<Integer> p=n->n%5==0;
		System.out.println(p.test(42));
		Stream<Integer> s=Stream.of(45,34,45);
		//s.forEach(System.out::println);
		s.forEach(n->System.out.println(n));
	}
}
