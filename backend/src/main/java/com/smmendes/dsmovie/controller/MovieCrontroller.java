package com.smmendes.dsmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smmendes.dsmovie.dto.MovieDTO;
import com.smmendes.dsmovie.dto.service.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieCrontroller {
	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pegeable) {
		return service.findAll(pegeable);
	}

	@GetMapping(value = "/{id}")
	public MovieDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}	
}
