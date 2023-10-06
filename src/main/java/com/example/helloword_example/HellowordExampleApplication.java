package com.example.helloword_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HellowordExampleApplication {


    @RequestMapping("/")
    String home() {
        return "Hello Word asas";
    }

    public static void main(String[] args) {

        SpringApplication.run(HellowordExampleApplication.class, args);

    }

}
