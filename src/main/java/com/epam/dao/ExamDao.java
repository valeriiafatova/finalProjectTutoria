package com.epam.dao;

import com.epam.model.Exam;
import com.epam.model.Student;
import com.epam.model.Teacher;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.epam.enums.Score.*;

public class ExamDao {
    public List<Exam> getExamsByStudent(int id) {
        List<Exam> exams = new ArrayList<>();
        if(id == 1){
            exams.add(new Exam(1, new Teacher(1), new Student(1), LocalDateTime.now(), A));
            exams.add(new Exam(2, new Teacher(1), new Student(1), LocalDateTime.now(), B));
        }else if (id ==2){
            exams.add(new Exam(2, new Teacher(1), new Student(2), LocalDateTime.now(), D));
        }else{
            exams.add(new Exam(2, new Teacher(1), new Student(3), LocalDateTime.now(), A));
        }
        return exams;
    }
}
