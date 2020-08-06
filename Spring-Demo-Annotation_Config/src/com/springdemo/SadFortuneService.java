package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you will be sad.";
	}

}
