package com.epam.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeCommand extends AbstractCommand{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }
}
