package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach trackCoach = context.getBean("trackCoach",Coach.class);
		
		Coach trackCoach1 = context.getBean("trackCoach",Coach.class);
		
		Coach baseBallCoach = context.getBean("baseBallCoach",Coach.class);
		
		Coach baseBallCoach1 = context.getBean("baseBallCoach",Coach.class);
		
		CricketCoach cricketCoach = context.getBean("cricketCoach",CricketCoach.class);
		
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		System.out.println(baseBallCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		if(trackCoach == trackCoach1)
			System.out.println("TrackCoach Singleton");
		
		if(baseBallCoach == baseBallCoach1)
			System.out.println("Baseball Singleton");
		
		context.close();
		
	}

}
