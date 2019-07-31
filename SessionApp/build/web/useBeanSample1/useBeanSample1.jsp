<%-- 
    Document   : useBeanSample1
    Created on : Mar 1, 2019, 8:21:30 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.litinow.utils.Dog" %>
<%@page import="com.litinow.utils.Person" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>useBeanSample1</title>
    </head>
    <body>
        <h1>useBean Sample 1</h1>
        <jsp:useBean id="personSample1" class="com.litinow.utils.Person" scope="page">
            <jsp:setProperty name="personSample1" property="*"/>
        </jsp:useBean>

        <%
            ((Person)pageContext.getAttribute("personSample1")).setDog((Dog) request.getAttribute("dog"));
        %>

        <h1>Person created by jsp:useBean</h1>
        Name: <jsp:getProperty name="personSample1" property="name"/><br>
        Address: <jsp:getProperty name="personSample1" property="address"/><br>
        Phone: <jsp:getProperty name="personSample1" property="phone"/><br>
        <br><br>
        <h1>Person datails by EL</h1>
        Name: ${personSample1.name}<br>
        Address: ${personSample1.address}<br>
        Phone: ${personSample1.phone}<br>
        Person's Dog name: ${personSample1.dog.name}<br>
        Dog name Att from request: ${dog.name}<br>
        <br><br>

        <%--<a href="checkUseBeanObjectCreated.jsp">Check UseBean Object Created</a>--%>
    </body>
</html>
