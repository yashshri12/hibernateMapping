package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Viewer;
import com.api.service.ViewerServiceImpl;

@RestController
@RequestMapping("/viewer")
public class ViewerController {

	@Autowired
	private ViewerServiceImpl viewerServiceImpl;
	
	@PostMapping("/saveviewer")
	public List<Viewer> saveViewer(@RequestBody List<Viewer> viewers){
		return viewerServiceImpl.saveViewer(viewers);
	}
}
