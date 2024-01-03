package com.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.model.Planes;

public interface planesRepository extends JpaRepository<Planes, Integer> {

}
