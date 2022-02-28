package com.infosys.collections;

import java.util.*;
import java.util.concurrent.*;

public class NavigableSetExample{
	public static void main(String[] args) {
		System.out.println("Navigable set Example!\n");
		NavigableSet <Integer>nSet = new ConcurrentSkipListSet<Integer>();
		nSet.add(10);
		nSet.add(20);
		nSet.add(50);
		nSet.add(30);
		nSet.add(100);
		nSet.add(80);
		// Returns an iterator over the elements in navigable set, in ascending order.
		Iterator iterator = nSet.iterator();
		System.out.print("Ascending order navigable set: ");
		//Ascending order list
		while (iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		//Descending order list
		System.out.println("Descending order navigable set: " + nSet.descendingSet() + "\n");
		//Greater than or equal to the given element
		System.out.println("Least element in Navigable set greater than or equal to 35: " + nSet.ceiling(35));
		//Less than or equal to the given element
		System.out.println("Greatest element in Navigable set less than or equal to 35: " + nSet.floor(35) + "\n");
		//Viewing the portion of navigable set whose elements are strictly less than the given element
		System.out.println("Navigable set whose elements are strictly less than '40': " + nSet.headSet(40));
		//Viewing the portion of navigable set whose elements are greater than or equal to the given element
		System.out.println("Navigable set whose elements are greater than or equal to '40': " + nSet.tailSet(40) + "\n");
		//Removing first element from navigable set
		System.out.println("Remove element: "+nSet.pollFirst());
		//After removing the first element, now get navigable set
		System.out.println("Now navigable set: " + nSet.descendingSet() + "\n");
		//Removing last element from navigable set
		System.out.println("Remove element: " + nSet.pollLast());
		//After removing the last element, now get navigable set
		System.out.println("Now navigable set: " + nSet.descendingSet());
	}
}