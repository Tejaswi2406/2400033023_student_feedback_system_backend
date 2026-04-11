package com.feedbackproject.service;

import org.springframework.stereotype.Service;
import com.feedbackproject.model.Student;
import com.feedbackproject.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    // Register student
    public Student register(Student student) {
        return repo.save(student);
    }

    // Login student by email and password
    public Student login(String email, String password) {
        Student s = repo.findByEmail(email);
        if (s != null && s.getPassword().equals(password)) {
            return s;
        }
        return null; // invalid login
    }
}