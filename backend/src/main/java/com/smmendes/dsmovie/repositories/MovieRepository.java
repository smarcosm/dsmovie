package com.smmendes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smmendes.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	

}
