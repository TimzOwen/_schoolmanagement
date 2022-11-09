package com.timzowen.demo.service;

import com.timzowen.demo.model.Course;

import java.util.List;

public interface CourseService {

    // Interface methods to be implemented by impl package use in by the constructor
    List<Course> getAllCourses();

    Course saveCourse(Course course);

    Course getCourseByID(Long id);

    Course updateCourse(Course course);

    void deleteCourseById(Long id);
}
