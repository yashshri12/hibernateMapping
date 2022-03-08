package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Stream;

@Repository
public interface StreamRepository extends JpaRepository<Stream, Long> {

}
