package com.infosys.stream;

import java.util.Arrays;
import java.util.List;

public class Mapping {

	public static void main(String[] args) {
		
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		System.out.println("Word legnth for locations:");
		locations.stream().map(String::length).forEach(System.out::println);
		locations.stream().map(s->s.length()).forEach(System.out::println);
		
	}
}
