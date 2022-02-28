package com.infosys.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ColllectionsDemo {

	public static void main(String[] args) {
		//Collection
		//Collections
		int x[]= {3,2,5,6,1,8,9,2,3};
		Arrays.sort(x);
		
		List a=Arrays.asList(4,2,6,7,8,1,9,2);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		int index=Collections.binarySearch(a, 9);
		System.out.println(index);
		Collections.reverse(a);
		System.out.println(a);
		//Collections.fill(a,10);
		System.out.println(Collections.max(a));
		Collections.swap(a,2, 6);
		System.out.println(a);
		Collections.shuffle(a);System.out.println(a);
		
		
		
		

	}

}
