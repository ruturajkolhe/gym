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

import com.gym.model.Model;
import com.gym.service.ModelService;


@RestController
@CrossOrigin("http://localhost:3000")
public class ModelController {
	
	@Autowired
	public ModelService service;
	
	@GetMapping("/getallmember")
	public List<Model> getAllModel()
	{
		return service.getAllModel();
	}
	
	@GetMapping("/getmember/{id}")
	public Model getMemberById(@PathVariable Integer id){
		return service.getSingleMemberById(id);
	}
	
	
	@PostMapping("/addmember")
	public void addMember(@RequestBody Model model ) 
	{
		service.addMember(model);
	}
	
	@PutMapping("/updatemember/{id}")
	public void updateMember(@PathVariable Integer id, @RequestBody Model model ) 
	{
		service.updateMember(id , model);
	}
	
	@DeleteMapping("/deletemember/{id}")
	public void deleteMember(@PathVariable Integer id) {
		service.deleteMember(id);
	}
	

}
