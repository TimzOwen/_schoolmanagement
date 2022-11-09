package com.timzowen.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseName;
    private String courseTitle;
    private String lecturer;

    public Course(String courseName, String courseTitle, String lecturer) {
        super();
        this.courseName=courseName;
        this.courseTitle=courseTitle;
        this.lecturer=lecturer;
    }
    public Course(){}
}
