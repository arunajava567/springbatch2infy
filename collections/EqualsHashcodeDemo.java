package com.infosys.collections;
import java.util.*;
class User{
	private Integer id;
	private String userName;
	public User(Integer id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	@Override
	public int hashCode() {
		 return this.id;
	}
	//@Override
	public boolean equals(Object obj) {
		if(this == obj)
            return true;
         if(obj == null || obj.getClass()!= this.getClass())
            return false;
        User u = (User) obj;
         return (u.id == this.id && u.userName == this.userName);
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}
}
public class EqualsHashcodeDemo {
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(23);
		h.add(45);
		h.add(86);
		h.add(12);
		h.add(23);
		h.add(45);
		//Set - unique  equals() & hashCode()
		System.out.println(h);
		HashSet<User> users=new HashSet<User>();
		users.add(new User(10,"Ram"));
		users.add(new User(10,"Ram"));
		users.add(new User(10,"Ram"));
		users.add(new User(10,"Ram"));
		System.out.println(users);
		
		
		
		
		
	}
}
/*  equals()
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
User other = (User) obj;
if (id == null) {
if (other.id != null)
	return false;
} else if (!id.equals(other.id))
return false;
if (userName == null) {
if (other.userName != null)
	return false;
} else if (!userName.equals(other.userName))
return false;
return true; //id==id  userName==userName


hashCode()
	final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	

*/