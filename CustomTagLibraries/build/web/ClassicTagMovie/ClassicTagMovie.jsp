<%-- 
    Document   : ClassTagMovie
    Created on : Mar 15, 2019, 12:30:25 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mine" uri="LitinowClassicTag" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ClassicTags</title>
    </head>
    <body>
        <table border ="1">
            <mine:iteratorMovies>
                <tr><td>${movie}</td></tr>
            </mine:iteratorMovies>
        </table>
    </body>
</html>
