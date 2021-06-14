package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller2 {

    @Autowired UserServices userController;

    @GetMapping("/userimplage")
    public int getUserImplAge(){
        System.out.println(userController.getName());
        return userController.getUserAgeMutipliedByTwo(userController.getAge());
    }
}
