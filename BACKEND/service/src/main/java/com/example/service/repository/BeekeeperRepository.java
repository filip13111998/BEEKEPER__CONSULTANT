package com.example.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.facts.Pcelar;


@Repository
public interface BeekeeperRepository extends JpaRepository<Pcelar, Long>{
	Pcelar findByUsername(String username);
}
