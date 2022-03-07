package com.infy.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.infy.bean.Course;
import com.infy.bean.Student;
import com.infy.bean.WelcomeBean;
import com.infy.configuration.SpringConfig;

public class UserInterface {
	
	public static final Log LOGGER = LogFactory.getLog(UserInterface.class); 

	public static void main(String[] args) {
		
		/*
		 * WelcomeBean w=new WelcomeBean(); System.out.println(w.printWelcome());
		 */
		
		//old   2 3, cannot events //lazy 
		//BeanFactory factory=new XmlBeanFactory("xml");  1.ClassPathXML 2. Filesystem  3. WebXML
		
		//ApplicationContext    //4   eager loading
		AnnotationConfigApplicationContext applicationContext = new
 AnnotationConfigApplicationContext(SpringConfig.class); 
		Student s=(Student)applicationContext.getBean(Student.class);
		s.disp();
		
		//DI - IOC   - getBean
		
		/*
		 * WelcomeBean welcomeBean1 = (WelcomeBean)
		 * applicationContext.getBean(WelcomeBean.class);
		 * System.out.println(welcomeBean1.printWelcome() +"  "+welcomeBean1);
		 * WelcomeBean welcomeBean2 = (WelcomeBean)
		 * applicationContext.getBean(WelcomeBean.class);
		 * System.out.println(welcomeBean2.printWelcome() +"  "+welcomeBean2);
		 * 
		 * Course c1=(Course)applicationContext.getBean(Course.class); Course
		 * c2=(Course)applicationContext.getBean(Course.class);
		 * 
		 * System.out.println(c1.getCourse() +"  address:"+c1
		 * +"  hachcode"+c1.hashCode()); System.out.println("  address:"+c2
		 * +"  hachcode"+c2.hashCode());
		 * 
		 * 
		 * Environment environment = applicationContext.getEnvironment();
		 * System.out.println(environment.getProperty("id") +"  "+
		 * environment.getProperty("pwd")); // applicationContext.stop(); //
		 * applicationContext.start(); // applicationContext.registerShutdownHook();
		 * applicationContext.close();
		 */
			 
	}
}
