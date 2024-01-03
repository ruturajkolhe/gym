package com.gym.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.model.Model;
import com.gym.repository.ModelRepository;


@Service
public class ModelService {
	
	@Autowired
	public ModelRepository repo;
	
	public List<Model> getAllModel() {
		
		List<Model> lst = new ArrayList<>();
		repo.findAll().forEach(lst::add);
		return lst;
	}

	public void addMember(Model model) {
		repo.save(model);	
	}
	

	public void updateMember(Integer id, Model model) {
		repo.save(model);		
	}

	public Model getSingleMemberById(Integer id) {
		 Optional<Model> model = repo.findById(id);
		if(model.isPresent()) {
			return model.get();
		}
		throw new RuntimeException("member is not found for the id "+id);
		
	}

	public void deleteMember(Integer id) {
		repo.deleteById(id);
		
	}
	

}
