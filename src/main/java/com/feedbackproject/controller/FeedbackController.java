package com.feedbackproject.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.feedbackproject.model.Feedback;
import com.feedbackproject.service.FeedbackService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    private final FeedbackService service;

    public FeedbackController(FeedbackService service) {
        this.service = service;
    }

    @PostMapping("/submit")
    public Feedback addFeedback(@RequestBody Feedback f) {
        return service.saveFeedback(f);
    }

    @GetMapping("/all")
    public List<Feedback> getAll() {
        return service.getAllFeedback();
    }

    // NEW: Get feedback for a specific logged-in student
    @GetMapping("/student/{email}")
    public List<Feedback> getByEmail(@PathVariable String email) {
        return service.getFeedbackByEmail(email);
    }

    // NEW: Get feedback by course name
    @GetMapping("/course/{courseName}")
    public List<Feedback> getByCourse(@PathVariable String courseName) {
        return service.getFeedbackByCourse(courseName);
    }
}