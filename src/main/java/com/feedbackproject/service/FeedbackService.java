package com.feedbackproject.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.feedbackproject.model.Feedback;
import com.feedbackproject.repository.FeedbackRepository;

@Service
public class FeedbackService {

    private final FeedbackRepository repository;

    public FeedbackService(FeedbackRepository repository) {
        this.repository = repository;
    }

    public Feedback saveFeedback(Feedback f) {
        return repository.save(f);
    }

    public List<Feedback> getAllFeedback() {
        return repository.findAll();
    }

    // NEW: Logic to find by email
    public List<Feedback> getFeedbackByEmail(String email) {
        return repository.findByEmail(email);
    }

    // NEW: Logic to find by course
    public List<Feedback> getFeedbackByCourse(String courseName) {
        return repository.findByCourseName(courseName);
    }
}