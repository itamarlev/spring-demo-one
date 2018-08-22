package com.itamar.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring conf. file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve a bean from the spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);

		// run some methods
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());


		// close the context
		context.close();

	}

}
