package com.timzowen.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public Student(String firstName, String lastName, String email) {
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }
    public Student(){}

}
