package com.timzowen.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentControllerTest {

    private final StudentController studentController;

    StudentControllerTest(StudentController studentController) {
        this.studentController = studentController;
    }

    // delete student from database
    @Test
    void controllerCourse(long id){
        studentController.deleteStudent(id);
    }

}