package com.techchaggi.springcoredemo.rest;

import com.techchaggi.springcoredemo.common.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private Coach myCoach;

	@Autowired
	public DemoController(@Qualifier("aquatic") Coach theCoach) {
		myCoach = theCoach;
	}

	
	@GetMapping("/")
	public String getDefaultMethod() {
		return "Welcome to spring core demo app";
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
