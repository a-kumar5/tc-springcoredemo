package com.techchaggi.springcoredemo;

import org.springframework.stereotype.Component;


// @Component annotation marks the class as spring bean and makes it available for dependency injection
@Component
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}
	
}
