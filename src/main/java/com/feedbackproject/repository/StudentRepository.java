package com.feedbackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.feedbackproject.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);
}
