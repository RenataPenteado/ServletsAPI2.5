<%-- 
    Document   : response
    Created on : Mar 3, 2019, 7:24:50 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Custom Header Example</h1>
        Requet Header operation value: <h2>${header.operation}</h2>
        <br><h2>${header.food}</h2>
        <br><h2>${header.host}</h2>
    </body>
</html>
