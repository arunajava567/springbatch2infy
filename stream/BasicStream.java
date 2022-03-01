package com.infosys.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		
		//stream can be created with static data
		Stream<String> stream = Stream.of("I","G","I","G","A","T","E","\n");	
		stream.distinct().forEach((location)->System.out.print(location));
		//stream can be acquired from array or collections
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		stream = locations.stream();
		stream.forEach(System.out::println);
		
	}
}
