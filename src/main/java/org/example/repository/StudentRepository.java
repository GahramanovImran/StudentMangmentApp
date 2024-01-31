package org.example.repository;

import org.example.entty.Student;

import java.util.List;

public interface StudentRepository {
    void addStudent(Student student);
    Student getById(Long id);
    List<Student> getALl();
}
