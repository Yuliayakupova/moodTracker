package com.example.controller;

import com.example.dto.Tests;
import com.example.repository.TestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestsController {

    private final TestsRepository testsRepository;

    @Autowired
    public TestsController(TestsRepository testsRepository) {
        this.testsRepository = testsRepository;
    }

    @GetMapping("/tests/{testsId}")
    public ResponseEntity<Tests> getTests(@PathVariable int testsId) {
        Tests tests = testsRepository.getTestsById(testsId);
        if (tests == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tests);
    }
}
