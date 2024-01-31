package org.example;

import org.example.controller.StudentController;
import org.example.dto.request.AddStudentRequest;
import org.example.dto.response.GetStudentResponse;
import org.example.utill.RequestBuilderUtill;

import java.util.List;
import java.util.Scanner;

public class Main {


    private static final StudentController studentController = new StudentController();


    public static void main(String[] args) {

        while(true){   //23A
            menu();
        }
//        System.out.println("""
//                1. add Student
//                2. get All Student
//                """);
    }

    private static void menu(){               //   22A     //23ARequestBuilderUtill
        System.out.println("""
                Choose your process:
                1. add Student
                2. add Teacher
                3. get All Student 
                4. get All Teacher
                                 
                """);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                addStudent();
                break;
            case 2:
                getallstudent();
                break;
            default:
                System.out.println("your chocie is not ok for us. please try again");
        }
    }
    private static void addStudent(){     //24A
        AddStudentRequest addStudentRequest = RequestBuilderUtill.buildAddStudentRequest();
        studentController.addStudent(addStudentRequest);
        System.out.println("Student added succesfully");

    }
    private static void getallstudent(){

        List<GetStudentResponse> students = studentController.getAllStudents();
        for (GetStudentResponse student: students){
            System.out.println(student.toString());
        }

    }
}