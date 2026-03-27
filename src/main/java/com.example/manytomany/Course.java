package com.example.manytomany;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    // getter setter

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}