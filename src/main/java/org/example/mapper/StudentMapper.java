package org.example.mapper;

import org.example.dto.request.AddStudentRequest;
import org.example.dto.response.GetStudentResponse;
import org.example.entty.Student;
import org.example.utill.DateUtill;

import java.util.ArrayList;
import java.util.List;

public class StudentMapper {
    public Student tostudent(AddStudentRequest addStudentRequest){
        Student student = new Student();
        student.setName(addStudentRequest.getName());
        student.setSurname(addStudentRequest.getSurname());
        student.setBirthDate(                     // 4A  getBirthdate ede bilmeyecyimiz ucun Utill package de DateUtil clasi yaradiriq
                DateUtill.toLocalDate(
                        addStudentRequest.getBirthday()
                )
        );

        return student;
    }

    public List<GetStudentResponse> toGetStudentResponseList(List<Student>studentList){  //18A
        List<GetStudentResponse> getStudentResponsesList = new ArrayList<>();

    for(Student student: studentList){
        GetStudentResponse getStudentResponse = new GetStudentResponse();

        getStudentResponse.setId(student.getId());
        getStudentResponse.setName(student.getName());
        getStudentResponse.setSurname(student.getSurname());
       // getStudentResponse.setBirthdate(student.getBirthDate());  //19A DateUtil

        getStudentResponse.setBirthdate(                //20A     21A  StudentService
                DateUtill.toString(
                        student.getBirthDate()
                )
        );
        getStudentResponsesList.add(getStudentResponse);

    }
       return getStudentResponsesList;


    }
}
