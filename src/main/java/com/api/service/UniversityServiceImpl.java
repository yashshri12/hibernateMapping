package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.University;
import com.api.repository.UniversityRepository;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityRepository universityRepository;
	
	@Override
	public University saveUniversity(University university) {
		
		return universityRepository.save(university);
	}

}
