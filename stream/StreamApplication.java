package com.infosys.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
public class StreamApplication {
	public static void main(String[] args) {
      Stream st=Stream.of(34,56,78,56);
      st.forEach(System.out::println);
      
      List<Integer> list=Arrays.asList(23,67,89,67);
     
      list.parallelStream().forEach(x->System.out.println(x));
      //map intermediate
      List<String> namelist=Arrays.asList("capgemini","cg","cgtechnologies");
      
      namelist.stream().map(x->x.length()).forEach(System.out::println);
      
      List<Integer> list1=Arrays.asList(3,7,89,67);
      
      //lazy
      
      list1.parallelStream().map(x->x>10).forEach(System.out::println);
      //
      List<Integer> list2=Arrays.asList(3,7,89,67,7,3,89);
      
      list2.stream().distinct().forEach(System.out::println);
      
      List<Integer> list3=Arrays.asList(3,7,89,67,7,3,89);
      //limit
      list3.stream().limit(3).distinct().forEach(System.out::println);
      
      //treminal operation
      List<Integer> list4=Arrays.asList(3,7,89,67,7,3,89);


      Optional<Integer> sum=list4.stream().reduce((x,y)->x+y);
      
      System.out.println(sum.get());
      
      
      
	}

}
