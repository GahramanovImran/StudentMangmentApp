package org.example.entty;

import org.example.entty.enums.Subjects;

import java.time.LocalDate;
import java.util.Objects;

public class Student extends Human{




    private Long id;
    private Subjects subjects;


    public Student() {
    }

    public Student(Long id, Subjects subjects) {
        this.id = id;
        this.subjects = subjects;
    }

    public Student(String name, String surname, LocalDate birthDate, Long id, Subjects subjects) {
        super(name, surname, birthDate);
        this.id = id;
        this.subjects = subjects;
    }








    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }









    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && subjects == student.subjects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, subjects);
    }







    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", subjects=" + subjects +
                "} " + super.toString();
    }


    }

