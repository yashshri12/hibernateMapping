package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.University;
import com.api.service.UniversityServiceImpl;

@RestController
@RequestMapping("/university")
public class UniversityController {

	@Autowired
	private UniversityServiceImpl universityServiceImpl;
   
	@PostMapping("/saveUniversity")
   public University saveUniversity(@RequestBody University university) {
	   return universityServiceImpl.saveUniversity(university);
   }
}
