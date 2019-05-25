package com.epam.web;

import com.epam.dao.StudentDao;
import com.epam.command.Command;
import com.epam.command.GenerateStudentsReport;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    private StudentDao studentDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Command command = new GenerateStudentsReport();

        String page = command.execute(request);

        request.getRequestDispatcher(page)
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
