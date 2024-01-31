package org.example.repository.impl;

import org.example.entty.Student;
import org.example.repository.StudentRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository {


    private static final Map<Long,Student> students = new HashMap<>();

    @Override
    public void addStudent(Student student){

        students.put(student.getId(), student);
    }
    @Override
    public Student getById(Long id){

        return students.get(id);
    }

    @Override
    public List<Student>getALl(){  //13A
        return new ArrayList<>(students.values());
    }


}
