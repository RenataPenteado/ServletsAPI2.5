<%-- 
    Document   : newjsp
    Created on : Feb 5, 2019, 1:07:39 PM
    Author     : Administrator
--%>
<%@page import ="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1 align="center">Beer Recomendations Jsp</h1>
            <p>
                <%
                            List styles = (List) request.getAttribute("styles");
                            Iterator it = styles.iterator();
                            while (it.hasNext()) {
                                out.print("<br>try: " + it.next());
                            }
                %>
            </p>
            <br><br>
            <a href="http://localhost:8084/FirstSimpleServlet/form.html">Calling the form html page</a>
        </center>
    </body>
</html>
