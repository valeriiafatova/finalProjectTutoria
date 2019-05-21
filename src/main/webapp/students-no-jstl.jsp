<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="com.epam.model.Student" %>
<%@ page import="java.util.ArrayList" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8"> <title>Insert title here</title>
</head>
<body>
    <%
      ArrayList<Student> students=(ArrayList<Student>) request.getAttribute("students");
      for (Student student: students) {
      %>
      <tr>
        <td><%=student.getId()%></td>
        <td><%=student.getName()%></td>
        <td><%=student.getAge()%></td>
        <td><%=student.getPhone()%></td>
       </tr>
    <%}%>
</body>
</html>