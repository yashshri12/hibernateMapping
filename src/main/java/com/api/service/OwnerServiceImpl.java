package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Owner;
import com.api.repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService {
    
	@Autowired
	private OwnerRepository ownerRepository;
	
	@Override
	public Owner saveOwner(Owner owner) {
		
		return ownerRepository.save(owner);
	}

}
