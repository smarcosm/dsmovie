package com.smmendes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smmendes.dsmovie.entities.Score;
import com.smmendes.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	

}
