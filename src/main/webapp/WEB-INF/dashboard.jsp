<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: scc
  Date: 1/11/2021
  Time: 12:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<a href="songs/new">Add Song</a>

<center>
<h1>All Songs</h1>
<table>
    <thead>
    <tr>
        <th>title</th>
        <th>rating</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${songs}" var="lang">
        <tr>
            <td><a href="languages/${songs.id}"><c:out value="${songs.title}"/></a></td>
            <td><c:out value="${songs.rating}"/></td>
            <td><a href="songs/delete/${songs.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</center>
</body>
</html>
