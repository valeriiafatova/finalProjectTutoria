package com.epam.web;

import com.epam.dao.StudentDao;
import com.epam.model.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DispatcherServletTest {
   //@InjectMocks
    private DispatcherServlet dispatcherServlet;
    @Mock
    private StudentDao studentDao;
    @Mock
    private HttpServletResponse response;
    @Mock
    private HttpServletRequest request;
    @Mock
    private RequestDispatcher requestDispatcher;
    private List<Student> students;

    @Before
    public void setUp(){
        dispatcherServlet =  new DispatcherServlet();
        //dispatcherServlet.setStudentDao(studentDao);
        students = new ArrayList<>();
        students.add(new Student(1, "Valeriia", 23, "11122333"));
        when(studentDao.getStudents())
                .thenReturn(students);
        when(request.getRequestDispatcher("jsp/students.jsp")).thenReturn(requestDispatcher);
        when(request.getRequestDispatcher(anyString())).thenReturn(requestDispatcher);
    }

    /**
     *
     * @throws ServletException
     * @throws IOException
     */
    @Test
    public void shouldSetStudentToRequest() throws ServletException, IOException {

        dispatcherServlet.doGet(request, response);

        verify(studentDao).getStudents();
        verify(request, times(1))
                .setAttribute("students", students);
        verify(requestDispatcher).forward(request, response);
    }
}
