package com.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.model.Model;

public interface ModelRepository extends JpaRepository<Model, Integer> {

	

}
