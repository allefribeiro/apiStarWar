package com.starwar.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starwar.apirest.models.Planeta;

public interface PlanetaRepository extends JpaRepository<Planeta, Long> {

	Planeta findById(long id);
	
	Planeta findById(String name);
}
