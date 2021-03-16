package net.techtter.aws.codebuild.example.helloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@SpringBootApplication
public class HelloServiceApplication {

    @GetMapping("/techtter")
    public String getHello() {
        return "<h1>Hello Techtter </h1>";
    }

    @GetMapping("/world")
    public String getWorld() {
        return "<h1>Hello World </h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication.class, args);
    }

}
