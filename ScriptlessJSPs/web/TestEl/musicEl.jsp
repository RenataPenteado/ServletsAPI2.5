<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ELTest</title>
    </head>
    <body>
        <h1>Ch 8 EL handles Null</h1>
         <%--bar exists but doesn't have any foo property and foo doesn't exists--%>
        <br> 1.) ${musicList[number[1]]}
        <br> 2.) ${musicList[number[0]+1]}
        <br> 3.) ${musicList[number["2"]]}
        <br> 4.) ${musicList[number[number[1]]]}

     


        <br><br>
        <a href="/ScriptlessJSPs/index.jsp">index page</a>
    </body></html>