package com.timzowen.demo;

import com.timzowen.demo.model.Student;
import com.timzowen.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentClassManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentClassManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

//	// test the database
//	@Override
//	public void run(String... args) throws Exception {
//
//		Student student = new Student("Timothy","Owen","timz@gmail.com");
//							studentRepository.save(student);
//		Student student1 = new Student("Ingosi","Nick","nIngisi@gmail.com");
//							studentRepository.save(student1);
//		Student student2 = new Student("simon","Injiri","simon@gmail.com");
//							studentRepository.save(student2);
//		Student student3 = new Student("Babu","Orengo","orengo@gmail.com");
//							studentRepository.save(student3);

}
