package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
