package com.epam.command;

import com.epam.dto.StudentDTO;
import com.epam.facade.GenerateStudentReportFacade;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class GenerateStudentsReport implements Command {
    private GenerateStudentReportFacade facade = new GenerateStudentReportFacade();
    @Override
    public String execute(HttpServletRequest request) {
        List<StudentDTO> studentDTOList = facade.getAllStudents();
        request.setAttribute("students", studentDTOList);

        return "jsp/students.jsp";
    }
}
