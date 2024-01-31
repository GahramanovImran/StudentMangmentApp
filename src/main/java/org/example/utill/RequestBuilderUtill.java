package org.example.utill;

import org.example.dto.request.AddStudentRequest;

import java.util.Scanner;

public class RequestBuilderUtill {   // 23A   24A Mainjava

    public static AddStudentRequest buildAddStudentRequest(){
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter student name");
        String name = sc.nextLine();

        System.out.println("please enter student surname");
        String surname = sc.nextLine();

        System.out.println("please enter student birthdate ( in day/month/year)");
        String birthday = sc.nextLine();


        AddStudentRequest addStudentRequest = new AddStudentRequest();
        addStudentRequest.setName(name);
        addStudentRequest.setSurname(surname);
        addStudentRequest.setBirthday(birthday);

        return addStudentRequest;
    }


}
