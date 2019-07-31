<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ELNestedExpressions</title>
    </head>
    <body>
        <%-- If you name the property but don't specify a value or param, you're telling the Container to
        get the value from a request parameter with a matching name. --%>

        <jsp:useBean id="person" type="com.litinow.utils2.Person" class="com.litinow.utils2.Employee">
            <jsp:setProperty name="person" property="*" />
        </jsp:useBean>

        Person: <jsp:getProperty name="person" property="name" />
        <jsp:getProperty name="person" property="id" />

        <br><br>
        <a href="/ScriptlessJSPs/index.jsp">index page</a>
    </body></html>