package com.bob.SpringPluralSight.repository;

import java.util.ArrayList;
import java.util.List;

import com.bob.SpringPluralSight.model.Speaker;

public class SpeakerRepoImpl implements SpeakerRepo {

	public List <Speaker> findAll() {
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		speaker.setName("Bob");
		speaker.setId("00023");
		speaker.setEmail("bob.mwangi");
		
		speakers.add(speaker);
		return speakers;
	}

}
