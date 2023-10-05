package com.example.Restaurant.Service.Repo;

import com.example.Restaurant.Service.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
