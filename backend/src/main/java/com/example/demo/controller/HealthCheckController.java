package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") // Permite o React acessar
public class HealthCheckController {

    @GetMapping("/api/hello")
    public String helloWorld() {
        return "Hello World! Backend conectado com sucesso!";
    }
}