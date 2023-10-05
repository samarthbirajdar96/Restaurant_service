package com.example.Restaurant.Service.Repo;

import com.example.Restaurant.Service.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
