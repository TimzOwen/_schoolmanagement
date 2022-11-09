package com.timzowen.demo.repository;

import com.sun.xml.bind.v2.model.core.ID;
import com.timzowen.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

// extend JPA repository to the entity and reference ID type [parameters are model and id type]
public interface CourseRepository extends JpaRepository<Course, Long> {
}
