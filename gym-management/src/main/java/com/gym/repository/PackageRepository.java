package com.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.model.GymPackage;

public interface PackageRepository extends JpaRepository<GymPackage, Integer> {

}
