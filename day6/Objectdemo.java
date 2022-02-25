package com.infosys;

//Object    java.lang

//1.getClass() 
//2.equals()  3.hashCode()
// 4.toString() -> display content in string format
// 5.finalize()
//6.wait ,7. notify, 8.notifyAll- thread
//9.clone();

class Book // implements Cloneable 
{
	Integer id;
	String title;
	Book(){
		id=10;
		title="java";	}
	public Book(Integer id, String title) {
		this.id = id;
		this.title = title;    	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}
	/*
	 * public Object clone() throws CloneNotSupportedException{ return
	 * super.clone(); }
	 */
	
}
class Student implements Cloneable {
	int sid;
	String email;
	Book b;
	Student() {
		sid = 99;
		email = "abc@gmail.com";
		this.b=new Book();
	}
	public Student(int sid, String email, Book b) {
	    this.sid = sid;
		this.email = email;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", email=" + email + ", b=" + b + "]";
	}
public Object clone() throws CloneNotSupportedException {
	Student s =(Student) super.clone();
 //   s.b=(Book)b.clone();
	return s;
	}
}
public class Objectdemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//Book b=new Book(12,"oracle");
        Student s=new Student(203,"Ram",new Book(13,"java"));
		System.out.println(s);
		Student ss=(Student)s.clone();
		
		System.out.println(ss);
	}
}

		/*
		 * Course c3=new JavaCourse(); System.out.println(c3.getClass());
		 * 
		 * 
		 * String s="java";
		 */
		/*
		 * Course c=new Course();
		 * 
		 * Course c1=new Course();
		 * 
		 * System.out.println(c.getClass()); System.out.println(s.getClass());
		 * System.out.println(c.equals(c1)); System.out.println(c+"  "+c1 +"  "+s);
		 * System.out.println(c.hashCode() +"  "+c1.hashCode() +"  "+ s.hashCode());
		 * 
		 * 
		 * System.out.println("Before:"+ c); Course c1=(Course)c.clone(); //new
		 * System.out.println("after :"+c1);
		 */

		
		
		
//	}

//}
