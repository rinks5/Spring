package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(@Qualifier("sadFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void startup() {
		System.out.println("TrackCoach Custom Method Started");
	}
	
	@PreDestroy
	public void delete() {
		System.out.println("TrackCoach Custom Method Delete");
	}

}
