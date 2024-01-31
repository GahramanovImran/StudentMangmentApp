package org.example.mapper;

import org.example.dto.request.AddTeacherRequest;
import org.example.dto.response.GetStudentResponse;
import org.example.dto.response.GetTeacherResponse;
import org.example.entty.Student;
import org.example.entty.Teacher;
import org.example.utill.DateUtill;

import java.util.ArrayList;
import java.util.List;

public class TeacherMapper {

    public Teacher toTeacher(AddTeacherRequest addTeacherRequest){
        Teacher teacher = new Teacher();
       teacher.setName(addTeacherRequest.getName());
       teacher.setSurname(addTeacherRequest.getSurname());
        teacher.setBirthDate(
                DateUtill.toLocalDate(

                        addTeacherRequest.getBirthdate()
                )
        );
        return teacher;
    }

    public List<GetTeacherResponse> toGetTeacherResponseList(List<Teacher>teachertList){
        List<GetTeacherResponse> getTeacherResponsesList = new ArrayList<>();

        for(Teacher teacher: teachertList){
            GetTeacherResponse getTeacherResponse = new GetTeacherResponse();

            getTeacherResponse.setTeacherid(teacher.getId());
            getTeacherResponse.setName(teacher.getName());
            getTeacherResponse.setSurname(teacher.getSurname());


            getTeacherResponse.setBirthdate(
                    DateUtill.toString(
                            teacher.getBirthDate()
                    )
            );
            getTeacherResponsesList.add(getTeacherResponse);

        }
        return getTeacherResponsesList;


    }
}
