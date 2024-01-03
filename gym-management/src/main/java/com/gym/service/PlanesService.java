package com.gym.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gym.model.Planes;
import com.gym.repository.planesRepository;

@Service
public class PlanesService {

	
	@Autowired
	public planesRepository planrepo;
	
	public List<Planes> getAllPlanes(){
		List<Planes> lst = new ArrayList<>();
		planrepo.findAll().forEach(lst::add);
		return lst;
	}
	
	public void addPlan(Planes p) {
		planrepo.save(p);
	}
	public void updatePlan(Integer id, Planes p) {
		planrepo.save(p);		
	}
	
	public void deletePlan(Integer id) {
		planrepo.deleteById(id);
		
	}
	public Planes getPlanById(Integer id) {
		 Optional<Planes> pln = planrepo.findById(id);
		if(pln.isPresent()) {
			return pln.get();
		}
		throw new RuntimeException("member is not found for the id "+id);
		
	}
	
	
	
}
