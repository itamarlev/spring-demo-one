package com.itamar.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load spring conf. file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//close the context
		context.close();
	}

}
