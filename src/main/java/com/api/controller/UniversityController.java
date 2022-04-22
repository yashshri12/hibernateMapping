package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.model.University;
import com.api.service.UniversityServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/university")
public class UniversityController {

	@Autowired
	private UniversityServiceImpl universityServiceImpl;
   
	@PostMapping("/saveUniversity")
   public University saveUniversity(@RequestBody University university) {
	   return universityServiceImpl.saveUniversity(university);
   }

   @GetMapping("/find")
	public List<University> findUniversity(){
		return  universityServiceImpl.find();
   }

   @PostMapping("/update/{id}")
   public University updateUniversity(@RequestBody University university,@PathVariable("id")  Long id){
		return universityServiceImpl.updateUniversity(university,id);
   }
}
