package com.example.Restaurant.Service.Repo;

import com.example.Restaurant.Service.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food,Long> {
}
