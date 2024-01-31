package org.example.repository;

import org.example.entty.Teacher;

import java.util.List;

public interface TeacherRepository {
    void addTeacher(Teacher teacher);
    Teacher getById(Long teacherid);
    List<Teacher> getAll();
}
