package com.smmendes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smmendes.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
