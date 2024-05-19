package com.example.librarymanagementsystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ExampleController {

    @GetMapping
    public ResponseEntity<?> helloWorld() {
        return ResponseEntity.ok("Hello world!");
    }
}
