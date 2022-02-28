package com.infosys.collections;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	
	 public int compare(Employee e1,Employee e2) { 
			
		 
		 return (int)( e1.getSal()-e2.getSal());
	  }

}
