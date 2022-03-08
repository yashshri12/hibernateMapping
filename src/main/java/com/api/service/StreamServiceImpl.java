package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Stream;
import com.api.repository.StreamRepository;

@Service
public class StreamServiceImpl implements StreamService {
    @Autowired
	private StreamRepository streamRepository;
	@Override
	public List<Stream> saveStream(List<Stream> stream) {
		return streamRepository.saveAll(stream);
	}

}
