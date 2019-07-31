<%-- 
    Document   : session
    Created on : Feb 17, 2019, 12:50:32 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Page</title>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            var interval = 1000;  // 1000 = 1 second, 3000 = 3 seconds
            var sessionHeaderController;
            function doAjax() {
                $.ajax({
                    type: 'GET',
                    url: 'CheckSessionServlet',
                    success: function(data, status, xhr) {
                        sessionHeaderController = xhr.getResponseHeader('SessionCurrentTime');
                        if( sessionHeaderController === 'expirated'){
                            $(location).attr('href', 'http://localhost:8084/PortalRef/LogoutServlet');
                        }else{
                            $('#sessionTimer').html(sessionHeaderController);
                        }
                    },
                    complete: function () {
                        // Schedule the next
                        setTimeout(doAjax, interval);
                    }
                });
            }
        </script>
    </head>
    <body onload="setTimeout(doAjax, 1000)">
        <h1><font onscroll ="down">Visit our Web Page !!!</font></h1>
        <% if (session.getAttribute("uname") != null) {%>
        Welcome <%=session.getAttribute("uname")%>
        <% }%>
        <h2>Your Login Success</h2>
        <h2 style="color: red">
            <div id ="sessionTimer"></div>
        </h2>
        <p>Thank you for visiting our Web Page</p>
        <br><a href="http://localhost:8084/PortalRef/LogoutServlet">Logout</a>
        <h3>Litinow Company Copyright&copy 2019</h3>
    <body>
</html>
