package com.timzowen.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    private StudentService studentService;

    @Test
    void serviceTestController(Long id){
        studentService.getStudentById(id);
    }

}