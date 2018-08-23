package com.itamar.springdemo;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {"first fortune","second fortune","third fortune"};
	
	@Override
	public String getFortune() {
		return fortunes[(int) Math.floor(Math.random() * 3)];
	}

}
