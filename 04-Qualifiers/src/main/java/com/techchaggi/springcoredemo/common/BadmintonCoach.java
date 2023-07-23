package com.techchaggi.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Smash for 30 mins";
	}

}
