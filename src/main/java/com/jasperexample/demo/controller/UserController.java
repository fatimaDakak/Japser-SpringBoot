package com.jasperexample.demo.controller;


import com.jasperexample.demo.Service.UserServiceImp;
import com.jasperexample.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    private UserServiceImp userServiceImp;

    public UserController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }
@GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userServiceImp.findAllUsers();
    }


    @PostMapping("/create")
    public String createUser(@RequestBody User user){

            userServiceImp.saveUser(user);

       return "saved";
    }
}
