<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8"> <title>Insert title here</title>
</head>
<body>
     <table>
       <c:forEach items="${students}" var="student">
        <tr>
          <td>${student.id}</td>
          <td><c:out value="${student.name}"/></td>
          <td><c:out value="${student.age}"/></td>
          <td><c:out value="${student.phone}"/></td>
        </tr>
       </c:forEach>
     </table>
</body>
</html>