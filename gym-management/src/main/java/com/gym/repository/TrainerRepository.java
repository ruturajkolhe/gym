package com.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.model.TrainerModel;

public interface TrainerRepository extends JpaRepository<TrainerModel, Integer> {

}
