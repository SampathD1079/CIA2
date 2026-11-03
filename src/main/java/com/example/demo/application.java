package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class application {

    @GetMapping("/")
    public String home() {
        return """
            <html>
              <head><title>Cloud CI/CD Demo</title></head>
              <body style="font-family:Arial;text-align:center;margin-top:80px">
                <h1>Cloud CI/CD Pipeline Successful!</h1>
                <h2>Version: v1</h2>
                <p>Java + Maven + Docker + Kubernetes + AWS</p>
                <p> by king </p>
              </body>
            </html>
            """;
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
