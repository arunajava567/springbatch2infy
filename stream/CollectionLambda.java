package com.infosys.stream;
import java.util.ArrayList;
import java.util.List;

public class CollectionLambda {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		cities.add("Pune");
		cities.add("Banglore");
		cities.add("Mumbai");
		cities.add("Chennai");
		
		cities.forEach(city->System.out.println(city));
		//cities.forEach(System.out::println);
		
	}
}
