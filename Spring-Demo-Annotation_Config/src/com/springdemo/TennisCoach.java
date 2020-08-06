package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice swing everyday.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
