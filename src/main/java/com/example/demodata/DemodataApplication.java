package com.example.demodata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
              import org.springframework.web.bind.annotation.GetMapping;
              import org.springframework.web.bind.annotation.PostMapping;
              import org.springframework.web.bind.annotation.RequestParam;
              import org.springframework.web.bind.annotation.RestController;
              import org.springframework.web.bind.annotation.PathVariable;
              import org.springframework.beans.factory.annotation.Autowired;
              import org.springframework.web.bind.annotation.RequestBody;
              import org.springframework.web.bind.annotation.PutMapping;
              import org.springframework.web.bind.annotation.DeleteMapping;


@SpringBootApplication
public class DemodataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemodataApplication.class, args);
	}

	@GetMapping("/hello")
                  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
                  return String.format("Hello there %s!", name);
                  }

}
