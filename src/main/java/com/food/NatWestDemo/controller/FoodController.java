package com.food.NatWestDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.food.NatWestDemo.persistence.domain.Food;
import com.food.NatWestDemo.service.FoodService;

@RestController
@CrossOrigin
public class FoodController {

	@Autowired
	private FoodService service;

	@GetMapping("/readAll")
	public ResponseEntity<List<Food>> getAll() {
		return new ResponseEntity<List<Food>>(this.service.readAll(), HttpStatus.OK);

	}

	@GetMapping("/findbyid/{id}")
	public ResponseEntity<Food> findById(@PathVariable("id") Long id) {
		return new ResponseEntity<Food>(this.service.findById(id), HttpStatus.FOUND);
	}

	@PostMapping("/create")
	public ResponseEntity<Food> create(@RequestBody Food food) {
		return new ResponseEntity<Food>(this.service.addFood(food), HttpStatus.CREATED);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Food> update(@PathVariable("id") Long id, @RequestBody Food food) {
		return new ResponseEntity<Food>(this.service.update(id, food), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
	}

}
