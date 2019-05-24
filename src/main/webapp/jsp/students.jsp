<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${locale}"/>
<fmt:setBundle basename="${bundle}"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>Insert title here</title>
</head>
<body>
     <table>
        <tr>
        <th><fmt:message key="student.id" /></th>
        <th><fmt:message key="student.name" /></th>
        <th><fmt:message key="student.age" /></th>
        <th><fmt:message key="student.phone" /></th>
        </tr>
         <c:forEach items="${students}" var="student">
        <tr>
          <td><c:out value="${student.id}"/></td>
          <td><c:out value="${student.name}"/></td>
          <td><c:out value="${student.age}"/></td>
          <td><c:out value="${student.phone}"/></td>
        </tr>
       </c:forEach>
     </table>
</body>
</html>