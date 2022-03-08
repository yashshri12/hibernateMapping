package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Stream;
import com.api.service.StreamServiceImpl;

@RestController
@RequestMapping("/stream")
public class StreamController {

	@Autowired
	private StreamServiceImpl streamServiceImpl;
	
	@PostMapping("/savestream")
	public List<Stream> saveStream(@RequestBody List<Stream> streams){
		return streamServiceImpl.saveStream(streams);
	}
}
