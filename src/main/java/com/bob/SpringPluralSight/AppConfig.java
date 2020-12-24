package com.bob.SpringPluralSight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bob.SpringPluralSight.repository.SpeakerRepo;
import com.bob.SpringPluralSight.repository.SpeakerRepoImpl;
import com.bob.SpringPluralSight.service.SpeakerService;
import com.bob.SpringPluralSight.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "speakerService")
	public SpeakerService getSpeakerService() {
		
		//setter injection
		/*
		 * SpeakerServiceImpl service = new SpeakerServiceImpl();
		 * service.setRepository(getSpeakerRepo());
		 */
		
		//constructor injection
		
		//SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepo());
		
		//annotation
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		return service;
	}
	
	@Bean(name = "speakerRepo")
	public SpeakerRepo getSpeakerRepo() {
		return new SpeakerRepoImpl();
	}
}
 