<%-- 
    Document   : checkUseBeanObjectCreated
    Created on : Mar 1, 2019, 8:35:08 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>checkUseBeanObjectCreated</title>
    </head>
    <body>
        <h1>Check UseBean Object Created</h1>
         <jsp:useBean id="personSample1" class="com.litinow.utils.Person" scope="session"/>

        <h1>Person created by jsp:useBean</h1>
        Name: <jsp:getProperty name="personSample1" property="name"/><br>
        Address: <jsp:getProperty name="personSample1" property="address"/><br>
        Phone: <jsp:getProperty name="personSample1" property="phone"/><br>
        <br><br>
        <a href="/SessionApp">Return to index</a>
    </body>
</html>
