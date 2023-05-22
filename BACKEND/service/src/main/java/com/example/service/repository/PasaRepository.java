package com.example.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.facts.Pasa;

@Repository
public interface PasaRepository extends JpaRepository<Pasa, Long>{

}
