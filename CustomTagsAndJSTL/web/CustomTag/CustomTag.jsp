<%--
    Document   : CustomTag
    Created on : Mar 11, 2019, 1:27:26 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mine" uri="randomThings"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Custom Tag Use Sample</title>
    </head>
    <body>
        <h1>Custom Tag Use Sample</h1>
        <mine:advice identity="112233" user="${userName}"/>
    </body>
</html>
