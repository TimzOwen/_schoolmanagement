package com.timzowen.demo.controller;

import com.timzowen.demo.model.Course;
import com.timzowen.demo.service.CourseService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        super();
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public String listStudents(Model model){
        model.addAttribute("courses",courseService.getAllCourses());
        return "courses";
    }

    @GetMapping("/courses/new")
    public String newCourse(Model model){
        Course course = new Course();
        model.addAttribute(course);
        return "create_course";
    }

    @PostMapping("/courses")
    public String saveCourse(@ModelAttribute("course") Course course){
        courseService.saveCourse(course);
        return "redirect:/courses";

    }

    @GetMapping("/course/edit/{id}")
    public String editCourseForm(@PathVariable("id") Long id, Model model){
        model.addAttribute("course",courseService.getCourseByID(id));
        return "edit_course";
    }

    @PostMapping("/course/{id}")
    public String updateCourse(@PathVariable("id") Long id,
                                @ModelAttribute("course") Course course,
                                Model model){
        Course existingCourse = courseService.getCourseByID(id);
        existingCourse.setId(id);
        existingCourse.setCourseName(course.getCourseName());
        existingCourse.setCourseTitle(course.getCourseTitle());
        existingCourse.setLecturer(course.getLecturer());
        return "redirect:/course";
    }

    @GetMapping("/course/{id}")
    public String deleteCourse(@PathVariable("id") Long id){
        courseService.deleteCourseById(id);
        return "redirect:/course";
    }
}
