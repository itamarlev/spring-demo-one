package com.itamar.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "play baseball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
