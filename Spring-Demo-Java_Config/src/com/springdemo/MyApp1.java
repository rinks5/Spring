package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp1 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig1.class);
		
		Coach swimCoach = context.getBean("swimCoach",Coach.class);
		
		Coach swimCoach1 = context.getBean("swimCoach",Coach.class);
		
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach);
		System.out.println(swimCoach1);
		
		context.close();

	}

}
