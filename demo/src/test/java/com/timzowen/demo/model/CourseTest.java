package com.timzowen.demo.model;

import com.timzowen.demo.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseTest {

    private CourseRepository courseRepository;
    @Test
    void modelCourses(Model model){
        model.addAttribute("student", courseRepository.findAll());
    }
}