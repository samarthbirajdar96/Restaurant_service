package com.example.Restaurant.Service.Service;

import com.example.Restaurant.Service.Model.Type;
import com.example.Restaurant.Service.Model.User;
import com.example.Restaurant.Service.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User adduser(User user) {
        if (user.getUserEmail().endsWith("@admin.com")) {
            user.setType(Type.admin);
        } else if (user.getUserEmail().endsWith("@gmail.com")) {
            user.setType(Type.normal_user);
        } else {
            // Handle invalid email format
            throw new IllegalArgumentException("Invalid email format");
        }

        // Implement user creation logic, including validation
        return userRepo.save(user);
    }


    public List<User> getalluser() {
        return userRepo.findAll();
    }
}
