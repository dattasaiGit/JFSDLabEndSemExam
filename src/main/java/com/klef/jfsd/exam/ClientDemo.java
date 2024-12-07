package com.klef.jfsd.exam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo 
{
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("Constructor Dependency Injection");
		Employee e = (Employee)context1.getBean("empbean");
		System.out.println(e.toString());
		
		System.out.println();
		
		System.out.println("AutoWiring using Setter Dependency");
		Course c = (Course)context2.getBean(Course.class,"coursebean");
		System.out.println(c.toString());
		
		context1.close();
		context2.close();
	}
}