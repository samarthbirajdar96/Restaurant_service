package com.example.Restaurant.Service.Service;

import com.example.Restaurant.Service.Model.Food;
import com.example.Restaurant.Service.Repo.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    FoodRepo foodRepo;


    public String addfood(Food myfood) {
        foodRepo.save(myfood);
        return "added";

    }

    public List<Food> getfoods() {
        return foodRepo.findAll();
    }

}
