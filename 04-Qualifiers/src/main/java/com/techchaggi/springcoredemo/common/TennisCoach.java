package com.techchaggi.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	public String getDailyWorkout() {
		return "Practice backhand for 30 mins!!";
	}
}
