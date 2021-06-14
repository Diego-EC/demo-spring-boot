package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controller1 {

    @Autowired UserServices userController;

    @GetMapping("/user/{name}")
    public String user(@PathVariable String name){
        return ("User: " + name);
    }

    @PostMapping("/useradd")
    public User userAdd(@RequestBody User user) {
        user.setAge(user.getAge() + 1);
        return user;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }


    @PostMapping("/userimpl")
    public UserServices userimpl(@RequestBody User user) {
        userController.setName(user.name);
        userController.setCity(user.city);
        userController.setAge(user.age);
        return userController;
    }
}
