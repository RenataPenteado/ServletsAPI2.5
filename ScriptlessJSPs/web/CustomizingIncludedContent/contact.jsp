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
        <title>Contact</title>
    </head>
    <body>
        <% pageContext.setAttribute("subTitle", "Sub Title Example!"); %>
        <%@ include file="header.jsp"%> <br>
        <em>We can help.</em> <br><br>
		Contact us at: <b>${initParam.mainEmail}</b>
                <br><br>
        <%@ include file="footer.html"%>
    </body>
</html>
