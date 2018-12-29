package com.example.accidentpropertyapi.Service;

import com.example.accidentpropertyapi.Model.User;
import com.example.accidentpropertyapi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> userAll(){
        return userRepository.userAll();
    }


}
