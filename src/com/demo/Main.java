package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String con="com/demo/resources/applicationContext.xml";
          ApplicationContext context=new ClassPathXmlApplicationContext(con);
          
          Student std=(Student) context.getBean("stdId");
          std.dis();
          Student std1=(Student) context.getBean("stdId2");
          std1.dis();
	}

}
