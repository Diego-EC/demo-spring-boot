/*
-> Ejercicio 2
Crear aplicación con dos clases de controlador. Controlador1.java y Controlador2.java
		En Controlador1 tiene que recibir como parámetros separados en los headers, el nombre, población
		y edad.
		Utilizando una clase de servicio, se creara un objeto Persona. La llamada devolverá el objeto Persona
		creado.
		En Controlador2 tiene que devolver el objeto Persona recibido en el Controlador1, multiplicando la
		edad por dos.
		Utilizar Inyección de dependencias.

https://www.tutorialspoint.com/spring_boot/spring_boot_service_components.htm
https://stackoverflow.com/questions/59985199/how-to-autowire-a-bean-into-a-2-different-controllers-spring


-> Ejercicio 1
Crear aplicación que tenga estos endpoints.
- /user/{nombre} (GET)
Devuelve un String poniendo “Hola” + el contenido de la variable nombre
- /useradd (POST)Recibe un objeto tipo Persona.
Persona sera una clase con los campos: nombre, población y edad,
Devolver un objeto persona cuya edad sea la recibida más una.
*/

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
