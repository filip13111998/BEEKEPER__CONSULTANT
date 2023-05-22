package com.example.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.facts.Dan;

@Repository
public interface DanRepository extends JpaRepository<Dan, Long>{

}
