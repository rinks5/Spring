package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component	
public class HappyFortuneService implements FortuneService {
	
	private String fortuneList[] = {"Today is your lucky day","Today is not your lucky day","Today is your descent day" };
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		return fortuneList[random.nextInt(3)];
	}

}
