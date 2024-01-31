package org.example.repository.impl;

import org.example.entty.Teacher;
import org.example.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherRepositoryImpl implements TeacherRepository {
//    private static final List<Teacher> teacherList = new ArrayList<>();

    private static final Map<Long, Teacher> teachers = new HashMap<>();
    @Override
    public void addTeacher(Teacher teacher){
        teachers.put(teacher.getId(), teacher);
//        teacherList.add(teacher);
    }

    @Override
    public Teacher getById(Long teacherid) {
        return teachers.get(teacherid);
    }

    public List<Teacher> getAll(){
        return new ArrayList<>(teachers.values());
    }
}

