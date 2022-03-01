package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(45,23,78,89,67);   // *10
		list.stream().map(x->x/2).forEach(x->System.out.println(x));
		
		Stream<Integer> s=Stream.of(10,20,30);
		s.forEach(System.out::println);
		
		Integer[] values=new Integer[] {23,34,45};
		Stream<Integer> s1=Arrays.stream(values);
		s1.forEach(x->System.out.println(x));
		
	//	long count=s1.count();
		//long max=Arrays.stream(values).max();
		List<String> name=Arrays.asList("Rma","Arva","Sri");
		name.stream().map(x->x.length()).forEach(System.out::println);
		
		//map
		System.out.println("===map===");
		List<Integer> intList=Arrays.asList(34,56,78,89,67);
		intList.stream().map(x->x>10).forEach(System.out::println);
		
		System.out.println("===distinct===");
		List<Integer> intList1=Arrays.asList(34,34,56,56,89,67);
		intList1.stream().distinct().forEach(System.out::println);
		
		System.out.println("===limit===");
		List<Integer> intList2=Arrays.asList(34,34,56,56,89,67);
		intList2.stream().limit(3).forEach(System.out::println);
		
		List<Integer> intList3=Arrays.asList(34,34,56,56,89,67);
		
		Optional<Integer> sum=intList3.stream().reduce((a,b)->a+b);
		System.out.println("Sum:"+sum.get());
	}

}
//intermidiate operations  :filter,map,limit,concat

//terminal operations    : forEach,collect, count,max,min,reduce
