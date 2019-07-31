<%-- 
    Document   : form
    Created on : Apr 5, 2019, 3:18:50 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1 align="center">Beer Selection Page</h1>
            <div style="color: red"><html:errors /></div>
            <form method="POST" action="SelectBeer.do">
                <p>Select beer characteristics</p>
                Color:
                <select name="color" size="1">
                    <option value="light">light</option>
                    <option value="amber">amber</option>
                    <option value="brown">brown</option>
                    <option value="dark">dark</option>
                </select>
                <br><br>
                <input type="SUBMIT" value="SUBMIT"/>
            </form>
            <br><br>
            <a href="http://localhost:8084/Beer-v1/Tester.do">Calling the Tester.do Servlet</a>
        </center>
    </body>
</html>
