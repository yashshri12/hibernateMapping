package com.api.service;

import com.api.model.Student;
import com.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.University;
import com.api.repository.UniversityRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityRepository universityRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public University saveUniversity(University university) {
		
		return universityRepository.save(university);
	}

	@Override
	public List<University> find() {
		return universityRepository.findAll();
	}

	@Override
	public University updateUniversity(University university,Long id) {

		University update =universityRepository.findById(id).get();
		System.out.println(update.toString());

		update.setName(university.getName());
		update.setStudent(university.getStudent());
		return universityRepository.save(update);
	}

	@Override
	public void deleteUniversity(Long id) {
		universityRepository.deleteById(id);
	}


}
