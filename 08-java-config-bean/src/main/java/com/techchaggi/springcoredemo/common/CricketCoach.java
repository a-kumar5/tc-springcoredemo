package com.techchaggi.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// @Component annotation marks the class as spring bean and makes it available for dependency injection

//@Primary
@Component
public class CricketCoach implements Coach {

	public CricketCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 30 minutes more!!";
	}

}
