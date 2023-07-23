package com.techchaggi.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component annotation marks the class as spring bean and makes it available for dependency injection
@Component
//@Primary
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 30 minutes more!!";
	}
}
