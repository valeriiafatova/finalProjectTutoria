package com.epam;

import com.epam.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Valeriia", 23, "11122333"));
        return students;
    }

}
