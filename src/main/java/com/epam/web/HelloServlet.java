package com.epam.web;

import com.epam.StudentDao;
import com.epam.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class HelloServlet extends HttpServlet {

    private StudentDao studentDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Student> students = getStudentDao().getStudents();

        request.setAttribute("students", students);
        request.getRequestDispatcher("jsp/students.jsp")
                .forward(request, response);
    }

    public StudentDao getStudentDao() {
        if(studentDao == null){
            studentDao = new StudentDao();
        }
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
