package com.feedbackproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.feedbackproject.model.Feedback;
import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    // This name must match the field name in your Feedback.java model
    List<Feedback> findByEmail(String email);
    List<Feedback> findByCourseName(String courseName);
}