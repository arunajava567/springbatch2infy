package com.infosys.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Message1{
	void dispMsg(String s);
}
public class LambdaDemo1 {
public static void main(String[] args) {
		Message1 m=(s)->  System.out.println(s.toUpperCase());
		m.dispMsg("infosys");
		Message1 m1=(s)->System.out.println(s.length());
		m1.dispMsg("Infosys");
		Predicate<Integer> p=x->x>18;
		System.out.println(p.test(16));
		Function<Integer, String> funcCheckAge = (var age)->age>18?"Eligible":"Not eligible";
		System.out.println(funcCheckAge.apply(2));
		List<String> stringList = new ArrayList<String>();
		stringList.add("Abigail");
		stringList.add("Zachariah");
		stringList.add("Damien");
		stringList.add("Ralph");
		stringList.add("Gabriel");
		stringList.sort((str1,str2)->str2.compareTo(str1));                                  
		System.out.println(stringList);
		
		//1
		List nameList=Arrays.asList("Sita","Gita","Arun","Smith","John");
		nameList.parallelStream().forEach(n->System.out.println(n));//sequental
		
	    //2
	    Stream<Integer> s1=Stream.of(2,3,4,5,6,7);
	   // s1.forEach(n->System.out.println(n));
	    s1.forEach(System.out::println);   //method reference operator
	    
	    //3
	    
	    //Integer x[]= {3,2,4,5,6};
	//   Stream<Integer> s2=Stream.of(new Integer[]{1,2,3,4,1,2,3,7,8,5,6,7,8,9});
	 //   s2.forEach(System.out::println);  //static, instance, construtcor 
	    
	    //limit 
	    //System.out.println(" limit 3");
		//s2.limit(3).forEach(System.out::println);
	    
	 //filter 
	     //  System.out.println(" filter");
	     //	s2.filter(x->x%2==0).forEach(System.out::println);
	    
	 
	   //distinct
		    System.out.println("distinct");
			//s2.distinct().filter(x->x%2==0).limit(2).forEach(System.out::println);
		    
		    // sorted
		//	s2.sorted().forEach(System.out::println);
		
			//s2.map(n->n*10).distinct().limit(5).forEach(System.out::println);
		  //  s2.map(n->n*10).forEach(System.out::println);
			//Stream<String> n=Stream.of("Ram","Raj","Kiran");
			//n.map(n1->n1.toUpperCase()).forEach(x->System.out.println(x));
		    Stream<Integer> s2=Stream.of(new Integer[]{1,2,3,4,1,2,3,7,8,5,6,7,8,9});
		    
		  //  List<Integer> l1=s2.distinct().collect(Collectors.toList());//terminal
		    //l1.stream().forEach(x->System.out.println(x));//foreach is terminal
		    
		   //Double  as=s2.limit(5).collect(Collectors.averagingInt(x->x));//terminal
		   //System.out.println(as);
		   // l1.stream().forEach(x->System.out.println(x));//foreach is terminal
		    
		    Long count=s2.filter(x->x%2==0).count(); //terminal
			System.out.println(count);
			
			List<Integer> l5=Arrays.asList(3,4,5,6,7,8);
			
			Optional<Integer> o=l5.stream().reduce((a,b)->a+b);
			System.out.println(o.get()); 
			
	}

}
