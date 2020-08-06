package com.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	 public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void startup() {
		System.out.println("BaseBall Custom Method Started");
	}
	
	public void delete() {
		System.out.println("BaseBall Custom Method Delete");
	}

}
