package com.infosys.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering {

	public static void main(String[] args) {
		
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		Stream<String> stream = locations.stream();
		List<String> result = stream.filter((location)->location.length()>5).collect(Collectors.toList());
		result.stream().forEach((city)->System.out.println(city));
		
	}
}
