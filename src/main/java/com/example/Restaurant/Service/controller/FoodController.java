package com.example.Restaurant.Service.controller;

import com.example.Restaurant.Service.Model.Food;
import com.example.Restaurant.Service.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class FoodController {

    @Autowired
    FoodService foodService;


    @PostMapping("food")
    public String addfood(@RequestBody Food myfood){
      return   foodService.addfood(myfood);
    }

    @GetMapping("foods")
    public List<Food> getfoods(){
        return foodService.getfoods();
    }
}
