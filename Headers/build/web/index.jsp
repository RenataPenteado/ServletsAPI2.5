<%-- 
    Document   : index
    Created on : Mar 3, 2019, 12:46:01 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="./js/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="./js/localfn.js" type="text/javascript"></script>
    </head>
    <body>
        <h1>Header Sample</h1>
        <input id="clickMe" type="button" value="clickme" onclick="checkHeader();" />
        <h2 style="color: red">
            <div id ="servletResponse"></div>
        </h2>
    </body>
</html>
