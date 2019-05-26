package com.epam.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LocaleCommand extends AbstractCommand{

    private static final String LOCALE = "locale";

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String locale = request.getParameter(LOCALE);

        if(locale == null){
            sendError(response, HttpServletResponse.SC_BAD_REQUEST);
        }

        request.getSession().setAttribute(LOCALE, locale);

        return "";
    }
}
