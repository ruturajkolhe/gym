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

import com.gym.model.GymPackage;
import com.gym.service.GymPackageService;

@RestController
@CrossOrigin("http://localhost:3000")
public class GymPackageController {
	
	@Autowired
	public GymPackageService service;
	
	
	@GetMapping("/getallpackage")
	public List<GymPackage> getAllGymPackage(){
		return service.getAllPackage();
	}
	
	@PostMapping("/addpackage")
	public void addGymPackage(@RequestBody GymPackage pack) {
		service.addGymPackage(pack);
	}
	
	@PutMapping("/updatepackage/{id}")
	public void updateTrainer(@PathVariable Integer id, @RequestBody GymPackage pack) {
		service.updatePackage( id , pack);
	}
	
	@GetMapping("/getpackage/{id}")
	public GymPackage getPackageById(@PathVariable Integer id) {
		return service.getGymPackageById(id);
	}
	
	@DeleteMapping("/deletepackage/{id}")
	public void deleteTrainer(@PathVariable Integer id) {
		service.deleteGymPackage(id);
	}

}
