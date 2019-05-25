package com.epam.web;

import com.epam.command.Command;
import com.epam.factory.CommandFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {

    private static final String JSP_PATH = "/WEB-INF/jsp/%s.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getRequestURI()
                .substring(request.getContextPath().length());

        Command command = CommandFactory.getCommand(action);

        String page = command.execute(request);

        request.getRequestDispatcher(String.format(JSP_PATH, page))
                .forward(request, response);
    }
}
