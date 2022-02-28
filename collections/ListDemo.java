package com.infosys.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		//Collection
		ArrayList l=new ArrayList();
		//LinkedList
		//List l=new LinkedList();//new ArrayList();
		//Vector l=new Vector();//new ArrayList();
		l.add(34);// auto boxing 
		l.add(23);
		l.set(1, 99);
		l.add(87);
		l.add(88);
		l.add(3);
		l.add(14);
		l.add(6);
		l.add(65);
		System.out.println(l);
		
		Object[] o=l.toArray();
		
		l.remove(2);
		//l.clear();
		System.out.println(l.get(3));
		System.out.println(l.indexOf(14));
		System.out.println(l.lastIndexOf(14));
		System.out.println(l.contains(54));
		System.out.println(l);
		List l1=new ArrayList();
		l1.add(3);
		l1.add(6);
		l1.add(5);
	     l.addAll(l1); //bullk addition
        System.out.println(l);
        //l.removeAll(l1);
       // l.retainAll(l1);
        System.out.println(l);
       // System.out.println(l.containsAll(l1));
        System.out.println(l.size());
     System.out.println(" for ====");
        for(int i=0;i<l.size();i++)
        	System.out.println(l.get(i));
       System.out.println(" for each ");
		/*
		 * for(Object o: l) System.out.println(o);
		 */    System.out.println(" iterator  ");
        Iterator i=l.iterator();
        while(i.hasNext()) {
        	if((Integer)i.next()==88)
        			i.remove();
        		System.out.println(i.next());
        }
        System.out.println(l);
        Enumeration el=l.elements();  // remove is not possible,slow, vector
        while(el.hasMoreElements()) {
        	System.out.println(el.nextElement());
        }
        System.out.println(l);
        
        Stack s=new Stack();
        s.push(23);//int - Integer
        s.push(28);
        s.push(28);
        s.push(55);
        System.out.println(s.isEmpty());
        s.push(55);
        System.out.println(s.pop());
        System.out.println(s);
        while(!s.empty())
        System.out.println(s.pop());
        
       List l2=Arrays.asList(2,3,4,5,6);
        System.out.println("List iterator=====");
        ListIterator  li=l2.listIterator();
        while(li.hasNext())
        	System.out.println(li.next());
        while(li.hasPrevious())
        	System.out.println(li.previous());
        
	}

}
