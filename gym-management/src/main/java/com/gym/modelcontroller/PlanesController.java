package com.gym.modelcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gym.model.Planes;
import com.gym.service.PlanesService;

@RestController
@CrossOrigin("http://localhost:3000")
public class PlanesController {
	
	@Autowired 
	public PlanesService plnservice;
	
	@GetMapping("/getallplanes")
	public List<Planes> getAllPlanes(){
		return plnservice.getAllPlanes();
	}
	
	@GetMapping("/getplan/{id}")
	public Planes getPlanById(@PathVariable Integer id){
		return plnservice.getPlanById(id);
	}
	
	@PostMapping("/addplan")
	public void addPlan(@RequestBody Planes p ) 
	{
		plnservice.addPlan(p);
	}
	
	@PutMapping("/updatepln/{id}")
	public void updatePlan(@PathVariable Integer id, @RequestBody Planes p ) 
	{
		plnservice.updatePlan(id , p);
	}
	
	@DeleteMapping("/deleteplan/{id}")
	public void deletePlan(@PathVariable Integer id) {
		plnservice.deletePlan(id);
	}

}
