package com.food.NatWestDemo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.food.NatWestDemo.persistence.domain.Food;
import com.food.NatWestDemo.persistence.repo.FoodRepo;

@Service 
public class FoodService{
	public FoodRepo repo;
	
	public FoodService(FoodRepo repo) {
			super();
			this.repo = repo;
			
	}
	//Read all
	public List<Food> readAll(){
			return this.repo.findAll();
	}
	//Create
	public Food addFood(Food food) {
			return this.repo.saveAndFlush(food);
	}
	//find by id
	public Food findById(Long id) {
		return this.repo.findById(id).orElseThrow();
	}
		
	//Update
	public Food update(Long id, Food food) {
			Food exists = this.repo.getById(id);
			System.out.println(exists);
			exists.setType(food.getType());
			exists.setFlavour(food.getFlavour());
			exists.setVegan(food.isVegan());
			Food updated = this.repo.save(exists);
			return updated;
	}
	
	public Boolean delete(Long id) {
		this.repo.deleteById(id);
		boolean deleted =this.repo.existsById(id);
		return !deleted;
	}
	
}	