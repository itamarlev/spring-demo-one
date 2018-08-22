package com.itamar.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring conf.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean
		Coach coach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
