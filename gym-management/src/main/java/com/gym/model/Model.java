package com.gym.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Member")
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String Email;
	private String Address;
	private String Number;
	private String Trainers;
	
	public Model() {
		super();	
	}
	public Model(int id, String name, String email, String address, String number, String trainers) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Address = address;
		Number = number;
		Trainers = trainers;
		
	}
	public String getTrainer() {
		return Trainers;
	}
	public void setTrainer(String trainer) {
		Trainers = trainer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	

}
