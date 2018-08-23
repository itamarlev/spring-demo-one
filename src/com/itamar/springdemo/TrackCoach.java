package com.itamar.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "run a little";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add an init method
	public void startupStuff() {
	System.out.println("TrackCoach: inside method startupStuff");
	}
	//add a destroy 
	public void cleanStuff() {
		System.out.println("TrackCoach: inside method cleanStuff");
	}

}
