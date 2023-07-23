package com.techchaggi.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	public FootballCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes in dribbling";
	}
}