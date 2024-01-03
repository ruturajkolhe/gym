package com.gym.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.model.GymPackage;

import com.gym.repository.PackageRepository;



@Service
public class GymPackageService {
	
	@Autowired
	public PackageRepository prepo;

	public List<GymPackage> getAllPackage() {
		List<GymPackage> lst = new ArrayList<>();
		prepo.findAll().forEach(lst::add);
		return lst;
	}

	public void addGymPackage(GymPackage pack) {
		prepo.save(pack);
		
	}

	public void updatePackage(Integer id, GymPackage pack) {
		prepo.save(pack);
		
	}


	public void deleteGymPackage(Integer id) {
		prepo.deleteById(id);
	}


	public GymPackage getGymPackageById(Integer id) {
		
		Optional<GymPackage> packg = prepo.findById(id);
		if(packg.isPresent()) {
			return packg.get();
		}
		throw new RuntimeException("member is not found for the id "+id);	

	}

	
	

}
