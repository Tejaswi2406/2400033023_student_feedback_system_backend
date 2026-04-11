package com.feedbackproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String courseName;
    private String email;
    
    private int overallExperience;
    private int courseContent;
    private int teachingMethodology;
    private int doubtClarification; 
    
    @Column(columnDefinition = "TEXT")
    private String additionalComments;

    // Default Constructor
    public Feedback() {}

    // Parameterized Constructor
    public Feedback(String courseName, String studentEmail, int overallExperience, 
                    int courseContent, int teachingMethodology, int doubtClarification, 
                    String additionalComments) {
        this.courseName = courseName;
        this.email = studentEmail;
        this.overallExperience = overallExperience;
        this.courseContent = courseContent;
        this.teachingMethodology = teachingMethodology;
        this.doubtClarification = doubtClarification;
        this.additionalComments = additionalComments;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getStudentEmail() { return email; }
    public void setStudentEmail(String studentEmail) { this.email = studentEmail; }

    public int getOverallExperience() { return overallExperience; }
    public void setOverallExperience(int overallExperience) { this.overallExperience = overallExperience; }

    public int getCourseContent() { return courseContent; }
    public void setCourseContent(int courseContent) { this.courseContent = courseContent; }

    public int getTeachingMethodology() { return teachingMethodology; }
    public void setTeachingMethodology(int teachingMethodology) { this.teachingMethodology = teachingMethodology; }

    public int getDoubtClarification() { return doubtClarification; }
    public void setDoubtClarification(int doubtClarification) { this.doubtClarification = doubtClarification; }

    public String getAdditionalComments() { return additionalComments; }
    public void setAdditionalComments(String additionalComments) { this.additionalComments = additionalComments; }
}