package com.infosys.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(5,7,13,9,-1);
		Optional<Integer> result = intList.stream().filter((a)->a>0).reduce((a,b)->a<b?a:b);
		if(result.isPresent()) {
			System.out.println("Result:"+result.get());
		}
		
		
	}
}
