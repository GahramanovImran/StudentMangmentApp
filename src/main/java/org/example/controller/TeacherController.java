package org.example.controller;

import org.example.dto.request.AddTeacherRequest;
import org.example.dto.response.GetTeacherResponse;

import java.util.List;

public class TeacherController {

    private final TeacherController teacherController = new TeacherController();

    public void addTeacher(AddTeacherRequest addTeacherRequest){
        teacherController.addTeacher(addTeacherRequest);

    }
    public List<GetTeacherResponse>getAllTeachers(){
       return teacherController.getAllTeachers();
    }


}
