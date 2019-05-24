package com.epam.facade;

import com.epam.dto.StudentDTO;
import com.epam.model.Student;
import com.epam.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

public class GenerateStudentReportFacade {
    private StudentService studentService = new StudentService();


    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentService.getAllStudentsWithExams();

        return getStudentDtoList(students);
    }

    private List<StudentDTO> getStudentDtoList(List<Student> students) {
        return students.stream().map(student -> {
            StudentDTO dto = new StudentDTO();
            dto.setName(student.getName());
            dto.setPhone(student.getPhone());
            dto.setAccepted(isAccepted(student));
            return dto;
        }).collect(Collectors.toList());
    }

    private boolean isAccepted(Student student) {
        return student.getExams()
                .stream()
                .filter(exam -> exam.getScore().getScoreValue() > 3)
                .count() > 1;
    }
}
