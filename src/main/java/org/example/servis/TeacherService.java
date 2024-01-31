package org.example.servis;

import org.example.dto.request.AddTeacherRequest;
import org.example.dto.response.GetTeacherResponse;

import java.util.List;

public interface TeacherService {
    void addTeacher(AddTeacherRequest addTeacherRequest);
    List<GetTeacherResponse> getAllteacher();

}
