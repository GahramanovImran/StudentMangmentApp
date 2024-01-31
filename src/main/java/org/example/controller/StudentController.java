package org.example.controller;

import org.example.dto.request.AddStudentRequest;
import org.example.dto.response.GetStudentResponse;
import org.example.servis.impl.StudentServiceImpl;

import java.util.List;

public class StudentController {
    private final StudentServiceImpl studentService = new StudentServiceImpl();

    public  void addStudent(AddStudentRequest request) {// 3A StudentService clasdaki AddStudentRequest -> Request cevirik
        studentService.addStudent(request);

    }
   // public List<S>      //14A   dto -> response  GetStudentresponse clasi yaradiriq

    public List<GetStudentResponse>getAllStudents(){   // 16A    17A StudentService
       return studentService.getAllstudents();
    }

 }



