/*
Crear aplicación que tenga estos endpoints.
- /user/{nombre} (GET)
Devuelve un String poniendo “Hola” + el contenido de la variable nombre
- /useradd (POST)Recibe un objeto tipo Persona.
Persona sera una clase con los campos: nombre, población y edad,
Devolver un objeto persona cuya edad sea la recibida más una.
*/

package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController()
public class Controller1 {

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
}
