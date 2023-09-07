package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
/*src/
|-- main/
|   |-- java/
|   |   |-- com/
|   |   |   |-- example/
|   |   |   |   |-- YourApplication.java           <- Main application class
|   |   |   |   |-- controller/
|   |   |   |   |   |-- YourController.java        <- Controller class with request mappings
|   |   |   |   |   |-- CustomExceptionHandler.java <- Custom error handling class
|   |   |-- resources/
|   |   |   |-- application.properties             <- Application configuration
*/
