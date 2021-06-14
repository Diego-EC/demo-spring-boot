package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class UserImpl implements UserServices {

    String name;
    String city;
    int age;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCity(){
        return city;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge(){
        return age;
    }

    @Override
    public int getUserAgeMutipliedByTwo(int age) {
        return age * 2;
    }
}
