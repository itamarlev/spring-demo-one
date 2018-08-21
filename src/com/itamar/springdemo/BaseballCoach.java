package com.itamar.springdemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "play baseball";
	}
}
