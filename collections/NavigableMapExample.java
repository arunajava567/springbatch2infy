import java.util.*;
import java.util.concurrent.*;

public class NavigableMapExample{
	public static void main(String[] args) {
		System.out.println("Navigable Map Example!\n");
		NavigableMap <Integer, String>navMap = new ConcurrentSkipListMap<Integer, String>();
		navMap.put(1, "January");
		navMap.put(2, "February");
		navMap.put(3, "March");
		navMap.put(4, "April");
		navMap.put(5, "May");
		navMap.put(6, "June");
		navMap.put(7, "July");
		navMap.put(8, "August");
		navMap.put(9, "September");
		navMap.put(10, "October");
		navMap.put(11, "November");
		navMap.put(12, "December");
		//Displaying all data
		System.out.println("Data in the navigable map: " + navMap.descendingMap()+"\n");
		//Retrieving first data
		System.out.print("First data: " + navMap.firstEntry()+"\n");
		//Retrieving last data
		System.out.print("Last data: " + navMap.lastEntry()+"\n\n");
		//Retrieving the nreatest less than or equal to the given key
		System.out.print("Nearest less than or equal to the given key: " + navMap.floorEntry(5)+"\n");
		//Retrieving the greatest key strictly less than the given key
		System.out.println("Retrieving the greatest key strictly less than the given key: " + navMap.lowerEntry(3));
		//Retrieving a key-value associated with the least key strictly greater than the given key
		System.out.println("Retriving data from navigable map greter than the given key: " + navMap.higherEntry(5)+"\n");
		//Removing first
		System.out.println("Removing First: " + navMap.pollFirstEntry());
		//Removing last
		System.out.println("Removing Last: " + navMap.pollLastEntry()+"\n");
		//Displaying all data
		System.out.println("Now data: " + navMap.descendingMap());
	}
}