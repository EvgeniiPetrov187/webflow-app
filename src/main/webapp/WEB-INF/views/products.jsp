<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <a href="${flowExecutionUrl}&_eventId_home">Home</a>
</div>
<table>
    <c:forEach items="${products}" var="item">
        <tr>
            <td><c:out value="${item.code}" /></td>
            <td><c:out value="${item.title}" /></td>
            <td><c:out value="${item.url}" /></td>
            <td><c:out value="${item.price}" /></td>
        </tr>
        <tr>----------</tr>
    </c:forEach>
</table>
</body>
</html>
