package org.example.servis.impl;

import org.example.dto.request.AddStudentRequest;
import org.example.dto.response.GetStudentResponse;
import org.example.entty.Student;
import org.example.mapper.StudentMapper;
import org.example.repository.impl.StudentRepositoryImpl;
import org.example.utill.IdBuilder;

import java.util.List;

public class StudentServiceImpl implements org.example.servis.StudentService {
    private final StudentRepositoryImpl studentRepository = new StudentRepositoryImpl(); //1A repositorinin obyektini yaradiriq


    private final StudentMapper studentMapper = new StudentMapper(); // 7A mapper obyektini yaradiriq.

    @Override
    public void addStudent(AddStudentRequest request){  //2A  AddStudentRequest -> Request bunu Mapperde cevireceyik.

        Student student = studentMapper.tostudent(request);    //8A
      //  student.setId();      // 9A Utill pakage de Idbuilder clasi yaradiriq

        student.setId(IdBuilder.getNewId());   // 12A   13A StudentRepositoridedi
        studentRepository.addStudent(student);

    }

    @Override
    public List<GetStudentResponse> getAllstudents(){  //17A     //18A mapper
        List<Student> student = studentRepository.getALl();
        return studentMapper.toGetStudentResponseList(student);  //21A      22A Main

    }

}
