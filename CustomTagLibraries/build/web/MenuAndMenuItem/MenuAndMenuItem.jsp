<%-- 
    Document   : MenuAndMenuItem
    Created on : Mar 20, 2019, 6:18:17 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="menus" uri="MenuLibrary" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MenuAndMenuItem</title>
    </head>
    <body>
        <h1>Menu And Menu Item</h1>

        <menus:Menu>
            <menus:MenuItem itemValue="Dog"/>
            <menus:MenuItem itemValue="Cat"/>
            <menus:MenuItem itemValue="Bird"/>
            <menus:MenuItem itemValue="Mouse"/>
        </menus:Menu>
    </body>
</html>
