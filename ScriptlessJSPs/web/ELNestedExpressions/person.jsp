<%--
    Document   : contact
    Created on : Feb 26, 2019, 4:28:17 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ELNestedExpressions</title>
    </head>
    <body>
        <h1>Ch 8 Person's dog's toys</h1>
        ${person.name}'s dog ${person.dog.name}'s toys are: ${person.dog.toys[0].name},
        ${person.dog.toys[1].name}, and a ${person.dog.toys[2].name}
        <br><br>
        <a href="/ScriptlessJSPs/index.jsp">index page</a>
    </body>
</html>