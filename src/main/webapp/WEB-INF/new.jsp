<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>New Song</h1>
<form:form action="/dashboard/addSong" method="post" modelAttribute="song">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="artist">artist</form:label>
        <form:errors path="artist"/>
        <form:textarea path="artist"/>
    </p>

    <p>
        <form:label path="rating">rating</form:label>
            <form:errors path="rating"/>
            <form:input type="number" path="rating"/>
            <input type="submit" value="Add Song"/>
    </p>
</form:form>

</body>
</html>
