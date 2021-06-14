package com.example.demo;

public interface UserServices {
    void setName(String name);

    String getName();

    void setCity(String city);

    String getCity();

    void setAge(int age);

    int getAge();

    int getUserAgeMutipliedByTwo(int age);
}
