<%-- 
    Document   : session
    Created on : Feb 17, 2019, 12:50:32 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Page</title>
        <script src="./js/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="./js/jquery.cookie-v1.4.1.js" type="text/javascript"></script>
        <script src="./js/localfn.js" type="text/javascript"></script>
    </head>
    <body onload="setTimeout(calcOffset(), 1000)">
        <h1><font onscroll ="down">Visit our Web Page !!!</font></h1>
        <% if (session.getAttribute("uname") != null) {%>
        Welcome <%=session.getAttribute("uname")%>
        <% }%>
        <h2 style="color: red">
            <div id ="sessionTimer"></div>
        </h2>
        <br><a href="http://localhost:8084/SessionWithTimeout/LogoutServlet">Logout</a>
        <h5>Litinow Company Copyright&copy 2019</h5>
    <body>
</html>
