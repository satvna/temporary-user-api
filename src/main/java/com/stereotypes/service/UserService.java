package com.stereotypes.service;

import com.stereotypes.model.User;
import com.stereotypes.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public User AddUser(User user) {
        //user.setActive(true);
        return userRepository.save(user); //save method is used for post/insert in SQL, also update if object exists already
    }

    public List<User> GetALlUsers(){
        return userRepository.findAll();
    }

}
