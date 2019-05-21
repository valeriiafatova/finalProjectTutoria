package com.epam.web;

import com.epam.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean jstl = Boolean.parseBoolean(req.getParameter("jstl"));

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Valeriia", 23, "11111111"));
        students.add(new Student(1, "Valeriia", 23, "11111111"));
        req.setAttribute("students", students);
        if(jstl) {
            req.getRequestDispatcher("students.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("students-no-jstl.jsp").forward(req, resp);
        }
    }
}
