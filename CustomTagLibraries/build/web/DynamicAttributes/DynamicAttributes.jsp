<%-- 
    Document   : DynamicAttributes
    Created on : Mar 19, 2019, 7:46:36 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="dyna" uri="dynamic_library" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dynamic Attributes</title>
    </head>
    <body>
        <h1>Dynamic Attributes</h1>
        <dyna:dynamicTag name="Renata" dog="Madona" city="Bray" county="Wicklow" country="Bray" sport="Spinning" hobby="Pink"/>
        <br><br>
        <dyna:dynamicTag name="Mauricio" job="Systems Analyst" />
    </body>
</html>
