package com.example.demodata;
              import org.springframework.boot.SpringApplication;
              import org.springframework.boot.autoconfigure.SpringBootApplication;
              import org.springframework.web.bind.annotation.GetMapping;
              import org.springframework.web.bind.annotation.RequestParam;
              import org.springframework.web.bind.annotation.RestController;
              
              @SpringBootApplication
              @RestController
              public class hellocontroller {
                
                
                 

                   @GetMapping("/hi")
                  public String hi(@RequestParam(value = "name", defaultValue = "World") String name) {
                  return String.format("Hi there %s!", name);
                  }
                
              }
            