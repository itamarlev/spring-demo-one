package com.itamar.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		Coach myCoach = new TrackCoach();
		
		//use the object
		System.out.println(myCoach.getDailyWorkout());

	}

}
