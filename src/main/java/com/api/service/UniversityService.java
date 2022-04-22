package com.api.service;

import com.api.model.University;

import java.util.List;

public interface UniversityService {
  public University saveUniversity(University university);
  public List<University> find();
  public University updateUniversity(University university,Long id);
  public void deleteUniversity(Long id);
}
