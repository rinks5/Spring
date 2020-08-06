package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily swim for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void startup() {
		System.out.println("SwimCoach Custom Method Started");
	}
	
	@PreDestroy
	public void delete() {
		System.out.println("SwimCoach Custom Method Delete");
	}
}
