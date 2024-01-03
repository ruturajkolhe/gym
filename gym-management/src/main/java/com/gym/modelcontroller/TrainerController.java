package com.gym.modelcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gym.model.TrainerModel;
import com.gym.service.TrainerService;

@RestController
@CrossOrigin("http://localhost:3000")
public class TrainerController {
	
	@Autowired
	public TrainerService service;
	
	@GetMapping("/getalltrainer")
	public List<TrainerModel> getAllTrainer(){
		return service.getAllTrainer();
	}
	
	@PostMapping("/addtrainer")
	public void addTrainer(@RequestBody TrainerModel tmodel) {
		service.addTrainer(tmodel);
	}
	
	@PutMapping("/updatetrainer/{id}")
	public void updateTrainer(@PathVariable Integer id, @RequestBody TrainerModel tmodel) {
		service.updateTrainer( id , tmodel);
	}
	
	@GetMapping("/gettrainer/{id}")
	public TrainerModel getTrainerById(@PathVariable Integer id) {
		return service.getTrainerById(id);
	}
	
	@DeleteMapping("/deletetrainer/{id}")
	public void deleteTrainer(@PathVariable Integer id) {
		service.deleteTrainer(id);
	}
	

}
