package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerMavenApplication {
	
	@GetMapping("")
    public ResponseEntity<?> TestAPi(){
    	return ResponseEntity.ok("This is test api....!");
    }
	public static void main(String[] args) {
		SpringApplication.run(DockerMavenApplication.class, args);
	}

}
