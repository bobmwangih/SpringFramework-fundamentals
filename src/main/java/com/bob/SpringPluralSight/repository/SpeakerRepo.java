package com.bob.SpringPluralSight.repository;

import java.util.List;

import com.bob.SpringPluralSight.model.Speaker;

public interface SpeakerRepo {

	public List<Speaker> findAll();
}
