package com.epam.dao;

import com.epam.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Valeriia", 23, "11122333"));
        students.add(new Student(2, "Sasha", 23, "11122333"));
        students.add(new Student(3, "Orest", 23, "11122333"));
        return students;
    }

}
