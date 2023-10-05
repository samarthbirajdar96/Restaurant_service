package com.example.Restaurant.Service.Service;

import com.example.Restaurant.Service.Model.Order;
import com.example.Restaurant.Service.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public String addorder(Order order) {
        orderRepo.save(order);
        return "added";
    }

    public List<Order> getallorder() {
      return   orderRepo.findAll();
    }
}
