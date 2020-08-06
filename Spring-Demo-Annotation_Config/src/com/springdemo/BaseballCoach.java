package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component			
public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	 public BaseballCoach(@Qualifier("sadFortuneService")FortuneService fortuneService) {
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
	
	@PostConstruct
	public void startup() {
		System.out.println("BaseBall Custom Method Started");
	}
	
	@PreDestroy
	public void delete() {
		System.out.println("BaseBall Custom Method Delete");
	}

}
