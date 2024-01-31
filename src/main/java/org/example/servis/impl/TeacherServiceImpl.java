package org.example.servis.impl;

import org.example.dto.request.AddTeacherRequest;
import org.example.dto.response.GetTeacherResponse;
import org.example.entty.Teacher;
import org.example.mapper.TeacherMapper;
import org.example.repository.impl.TeacherRepositoryImpl;
import org.example.servis.TeacherService;
import org.example.utill.IdBuilder;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepositoryImpl teacherRepository = new TeacherRepositoryImpl();
    private final TeacherMapper teacherMapper = new TeacherMapper();

    @Override
    public  void addTeacher(AddTeacherRequest addTeacherRequest){
        Teacher teacher = teacherMapper.toTeacher(addTeacherRequest);
        teacher.setId(IdBuilder.getNewId());

        teacherRepository.addTeacher(teacher);
    }

    @Override
    public List<GetTeacherResponse> getAllteacher() {
        List<Teacher> teacher = teacherRepository.getAll();
        return teacherMapper.toGetTeacherResponseList(teacher);
    }
}
