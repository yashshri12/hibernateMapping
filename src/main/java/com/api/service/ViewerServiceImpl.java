package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Viewer;
import com.api.repository.ViewerRepository;

@Service
public class ViewerServiceImpl implements ViewerService {
    @Autowired
	private ViewerRepository viewerRepository;
	@Override
	public List<Viewer> saveViewer(List<Viewer>  viewer) {
		
		return viewerRepository.saveAll(viewer);
	}

}
