package com.epam.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LocalizationFilter implements Filter {
    private static final String LOCALE = "locale";
    private static final String BUNDLE = "bundle";
    private String defaultBundle;
    private String locale;

    @Override
    public void init(FilterConfig filterConfig) {
        defaultBundle = filterConfig.getInitParameter(BUNDLE);
        locale = filterConfig.getInitParameter(LOCALE);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        String localeParameter = request.getParameter(LOCALE);

        locale = localeParameter != null
                ? localeParameter
                : httpRequest.getSession().getAttribute(LOCALE) != null
                        ? (String) httpRequest.getSession().getAttribute(LOCALE)
                        : this.locale;


        httpRequest.getSession().setAttribute(LOCALE, locale);
        httpRequest.getSession().setAttribute(BUNDLE, defaultBundle);
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
