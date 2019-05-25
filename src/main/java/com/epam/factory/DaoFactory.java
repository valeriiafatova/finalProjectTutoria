package com.epam.factory;

import com.epam.dao.ExamDao;
import com.epam.dao.StudentDao;

public class DaoFactory {

    private static StudentDao studentDao;
    private static ExamDao examDao;

    static {
        studentDao = new StudentDao();
        examDao = new ExamDao();
    }

    public static StudentDao getStudentDao() {
        return studentDao;
    }

    public static ExamDao getExamDao() {
        return examDao;
    }
}
