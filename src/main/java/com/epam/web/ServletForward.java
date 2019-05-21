package com.epam.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletForward extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("name", "Valeriia");
        req.getRequestDispatcher("/servletInclude").include(req, resp);
        req.getRequestDispatcher("name.jsp").forward(req,resp);
    }
}
