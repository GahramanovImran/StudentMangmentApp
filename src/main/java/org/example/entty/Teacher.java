package org.example.entty;

import org.example.entty.enums.Subjects;

import java.time.LocalDate;
import java.util.Objects;

public class Teacher extends Human{

    private Subjects subjects;
    private Long teacherid;


     public Teacher() {
     }

    public Teacher(Subjects subjects, Long id) {
        this.subjects = subjects;
        this.teacherid = id;
    }

    public Teacher(String name, String surname, LocalDate birthDate, Subjects subjects, Long id) {
        super(name, surname, birthDate);
        this.subjects = subjects;
        this.teacherid = id;
    }













    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public Long getId() {
        return teacherid;
    }

    public void setId(Long id) {
        this.teacherid = id;
    }












    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return subjects == teacher.subjects && Objects.equals(teacherid, teacher.teacherid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subjects, teacherid);
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + subjects +
                ", id=" + teacherid +
                "} " + super.toString();
    }


}





