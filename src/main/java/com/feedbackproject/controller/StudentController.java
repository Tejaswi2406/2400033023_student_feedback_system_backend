package com.feedbackproject.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.feedbackproject.model.Student;
import com.feedbackproject.service.StudentService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // Register student
    @PostMapping("/register")
    public Student register(@RequestBody Student student) {
        return service.register(student);
    }

    // Login student
    @PostMapping("/login")
    public Student login(@RequestBody Student student) {
        Student loggedIn = service.login(student.getEmail(), student.getPassword());
        if (loggedIn == null) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
        }
        return loggedIn;
    }
}