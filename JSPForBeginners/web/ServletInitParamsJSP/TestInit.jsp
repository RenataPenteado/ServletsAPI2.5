<%-- 
    Document   : TestInit
    Created on : Feb 26, 2019, 4:07:09 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSPForBeginners Init params in a jsp</h1>
        <%!
            public void jspInit() {
                ServletConfig sConfig = getServletConfig();
                String emailAddr = sConfig.getInitParameter("email");
                ServletContext ctx = getServletContext();
                ctx.setAttribute("mail", emailAddr);
            }
        %>

        <%= "Application-scoped attribute: "%>
        <b><%= application.getAttribute("mail")%></b>

    </body>
</html>
