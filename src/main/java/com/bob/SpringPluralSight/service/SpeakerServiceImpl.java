package com.bob.SpringPluralSight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bob.SpringPluralSight.model.Speaker;
import com.bob.SpringPluralSight.repository.SpeakerRepo;
import com.bob.SpringPluralSight.repository.SpeakerRepoImpl;

public class SpeakerServiceImpl implements SpeakerService{
	
	public SpeakerRepo repository;
	
	
	
	public SpeakerServiceImpl(SpeakerRepo repository) {
		super();
		this.repository = repository;
	}



	public SpeakerServiceImpl() {
		// TODO Auto-generated constructor stub
	}



	@Autowired
	public void setRepository(SpeakerRepo repository) {
		this.repository = repository;
	}



	public List<Speaker> findAll() {
		
		return repository.findAll();
	}

	
}
