package com.epam.factory;

import com.epam.service.StudentService;

public class ServiceFactory {
    private static StudentService studentService = new StudentService();

    private ServiceFactory(){

    }

    public static StudentService getStudentService() {
        return studentService;
    }
}
