package com.epam.service;

import com.epam.dao.StudentDao;
import com.epam.dao.ExamDao;
import com.epam.factory.DaoFactory;
import com.epam.model.Exam;
import com.epam.model.Student;

import java.util.List;

public class StudentService {
    private StudentDao studentDao = DaoFactory.getStudentDao();
    private ExamDao examDao = DaoFactory.getExamDao();

    public List<Student> getAllStudentsWithExams() {

        List<Student> students = studentDao.getStudents();
        students.forEach(student -> {
                    List<Exam> exams = examDao.getExamsByStudent(student.getId());
                    student.setExams(exams);
                });

        return students;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void setExamDao(ExamDao examDao) {
        this.examDao = examDao;
    }
}
