<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ELNull</title>
    </head>
    <body>
        <h1>Ch 8 EL handles Null</h1>
        <%-- bar exists but doesn't have any foo property and foo doesn't exists --%>
        <br> 1.) ${foo}
        <br> 2.) ${foo[bar]}
        <br> 3.) ${bar[foo]}
        <br> 4.) ${foo.bar}
        <br> 5.) ${7 + foo}
        <br> 6.) ${7 / foo}
        <br> 7.)  ${7 - foo}
        <%--${7 % foo}--%> <%-- This line cause an ArithmeticException --%>
        <br> 8.) ${7 < foo}
        <br> 9.) ${7 == foo}
        <br> 10.) ${foo == foo}
        <br> 11.) ${7 != foo}
        <br> 12.) ${true and foo}
        <br> 13.) ${true or foo}
        <br> 14.) ${not foo}

        <br><br>
        <a href="/ScriptlessJSPs/index.jsp">index page</a>
    </body></html>