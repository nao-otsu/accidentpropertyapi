package com.example.accidentpropertyapi.Controller;

import com.example.accidentpropertyapi.Model.User;
import com.example.accidentpropertyapi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> userAll(){
        List<User> userList = new ArrayList<>();
        userList = userService.userAll();
        return userList;
//        return userService.userAll();
    }

}
