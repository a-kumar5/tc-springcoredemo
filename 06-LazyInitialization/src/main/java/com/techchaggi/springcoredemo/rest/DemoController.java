package com.techchaggi.springcoredemo.rest;

import com.techchaggi.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	// define a private field for the dependency
	// @Autowired - for field injection
	private Coach myCoach;
	private Coach anotherCoach;
	// define a constructor for dependency injection

	@Autowired
	public DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach) {
		myCoach = theCoach;
		anotherCoach = theAnotherCoach;
	}

	// You can name the method to any name not necessarily setters.
	// Code for setter injection
	/*
	 * @Autowired public void setCoach(Coach theCoach) { myCoach = theCoach; }
	 */
	@GetMapping("/")
	public String getDefaultMethod() {
		return "Welcome to spring core demo app";
	}
	
	// to return the bean scope
	@GetMapping("/beanscope")
	public String getScope() {
		return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
