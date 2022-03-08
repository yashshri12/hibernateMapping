package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Viewer;

@Repository
public interface ViewerRepository extends JpaRepository<Viewer, Long> {

}
