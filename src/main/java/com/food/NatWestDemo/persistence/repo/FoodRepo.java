package com.food.NatWestDemo.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.NatWestDemo.persistence.domain.Food;

	@Repository
	public interface FoodRepo extends JpaRepository<Food, Long> {


}