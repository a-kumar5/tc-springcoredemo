package com.techchaggi.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	// define a private field for the dependency
	@Autowired
	private Coach myCoach;

	// define a constructor for dependency injection
	/*
	 * @Autowired public DemoController(Coach theCoach) { myCoach = theCoach; }
	 */
	
	//You can name the method to any name not necessarily setters.
	/*
	 * @Autowired public void setCoach(Coach theCoach) { myCoach = theCoach; }
	 */

	@GetMapping("/")
	public String getDefaultMethod() {
		return "Welcome to spring core demo app";
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}

}
