package com.itamar.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-args c'tor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("I'm in the setFortuneService");
		this.fortuneService = fortuneService;
	}

}
