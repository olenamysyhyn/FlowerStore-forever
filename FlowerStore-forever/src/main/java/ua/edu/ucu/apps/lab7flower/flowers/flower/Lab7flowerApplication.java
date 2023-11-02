package ua.edu.ucu.apps.lab7flower.flowers.flower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab7flowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab7flowerApplication.class, args);
	}
}
