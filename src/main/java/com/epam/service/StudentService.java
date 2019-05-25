package com.epam.service;

import com.epam.dao.StudentDao;
import com.epam.dao.ExamDao;
import com.epam.model.Exam;
import com.epam.model.Student;

import java.util.List;

public class StudentService {
    private StudentDao studentDao = new StudentDao();
    private ExamDao examDao = new ExamDao();

    public List<Student> getAllStudentsWithExams() {

        List<Student> students = studentDao.getStudents();
        students.forEach(student -> {
                    List<Exam> exams = examDao.getExamsByStudent(student.getId());
                    student.setExams(exams);
                });

        return students;
    }
}
