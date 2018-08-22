package com.itamar.springdemo;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "swim a little";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
