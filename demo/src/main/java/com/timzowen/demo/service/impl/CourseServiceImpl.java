package com.timzowen.demo.service.impl;

import com.timzowen.demo.model.Course;
import com.timzowen.demo.repository.CourseRepository;
import com.timzowen.demo.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    // Inject the repository interface to allow calling JPA database methods
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        super();
        this.courseRepository = courseRepository;
    }

    // method to get all courses created
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // Method to save a course
    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    //Get individual course by id
    @Override
    public Course getCourseByID(Long id) {
        return courseRepository.findById(id).get();
    }

    // update course from the pulled data with id
    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    //remove course from the database
    @Override
    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }
}
