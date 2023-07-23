package com.techchaggi.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techchaggi.springcoredemo.common.Coach;
import com.techchaggi.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
	
	@Bean("aquatic")
	public Coach swimCoach() {
		return new SwimCoach();
	}
}
