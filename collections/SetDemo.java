package com.infosys.collections;

import java.util.*;

class Course implements Comparable
{
	private Integer courseId;
	private String name;
	public Course(Integer courseId, String name) {
		super();
		this.courseId = courseId;
		this.name = name;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + "]";
	}
	 public int compareTo(Object o) { 
		 Course c=(Course)o; if(
	 this.courseId>c.getCourseId()) 
			 return -1; 
		 else if (
	 this.courseId<c.getCourseId()) 
			 return 1; 
		 else return 0;
	  }
}

public class SetDemo {
	public static void main(String[] args) {
		//Set s=new HashSet();
		//Set s=new LinkedHashSet();  //unique ,un ordered
		/*Set s=new TreeSet();  //unique ,un ordered
		s.add(3);
		s.add(12);
		s.add(8);
		s.add(12);
		s.add(67);
		s.add(8);
		s.add(10);
		s.add(30);
		s.remove(8);
		//contains,clear,
		//index based remove(i), set(i,90),indexOf(),lastIndexOf()
		//not possible
		System.out.println(s);
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		*/
		
		
		Set<Course> courseSet=new TreeSet<Course>();
		
		courseSet.add(new Course(02,"java"));
		courseSet.add(new Course(8,"java/rest"));
		courseSet.add(new Course(06,"java/spring"));
		
		System.out.println(courseSet);

	}

}
