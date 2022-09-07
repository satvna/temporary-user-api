package com.stereotypes.controller;

import com.stereotypes.model.User;
import com.stereotypes.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("")
    public List<User> GetAllUsers(){
        return userService.GetALlUsers();
    }

    @PostMapping("")
    public User UploadUser(@RequestBody User user){
        return userService.AddUser(user);
    }
}