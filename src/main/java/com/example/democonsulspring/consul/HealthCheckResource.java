package com.example.democonsulspring.consul;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckResource {

    @GetMapping("/custom-health-check")
    public ResponseEntity<String> myCustomHealthCheck() {
        String message = "Health check test.";
        return new ResponseEntity<>(message, HttpStatus.ACCEPTED);
    }
}
