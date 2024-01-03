package com.gym.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gym.model.TrainerModel;
import com.gym.repository.TrainerRepository;

@Service
public class TrainerService {
	
	@Autowired
	public TrainerRepository trepo;
	
	
	public List<TrainerModel> getAllTrainer(){
		List<TrainerModel> lst = new ArrayList<>();
		trepo.findAll().forEach(lst::add);
		return lst;
	}

	public void addTrainer(TrainerModel tmodel) {
		trepo.save(tmodel);	
	}

	public void updateTrainer(Integer id ,TrainerModel tmodel) {
		trepo.save(tmodel);
	}
	
	public TrainerModel getTrainerById(int id) {
		Optional<TrainerModel> tmodel = trepo.findById(id);
		if(tmodel.isPresent()) {
			return tmodel.get();
		}
		throw new RuntimeException("member is not found for the id "+id);	
	}

	public void deleteTrainer(Integer id) {
		trepo.deleteById(id);	
	}
	
	

}
