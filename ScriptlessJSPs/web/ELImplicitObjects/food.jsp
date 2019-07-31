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
        <h1>Ch 8 Person's food taste</h1>
        <%-- REQUEST PARAMETERS IN EL--%>
		Request param name is: ${param.name} <br />
		Request param empID is: ${param.empID} <br />
		Request param food is: ${param.food} <br />
		First food request param: ${paramValues.food[0]} <br />
		Second food request param: ${paramValues.food[1]} <br />
                food request param: ${paramValues.food} <br />
		Request param name: ${paramValues.name[0]} <br />
                PageContext request: ${pageContext.request}<br />
                PageContext request: ${pageContext.request.method}<br />
                PageContext request: ${pageContext.request.locale}<br />
                PageContext out: ${pageContext.out.autoFlush}<br />
               
             

        <%-- Host header--%>
		Host is ([].operator): ${header["host"]} <br />
		Host is (.operator): ${header.host} <br />
                Connection is (.operator): ${header.connection} <br />
                Language is (.operator): ${header["accept-language"]} <br />
                Language is (.operator): ${headerValues["host"][0]} <br />
            

        <%-- Request Method--%>
		Request method is : ${pageContext.request.method} <br />

        <%-- Cookie --%>
		The cookie: ${cookie.username.value} <br />

        <%-- EL initParam for the context params --%>
		The email: ${initParam.mainEmail}
        <br><br>
        <a href="/ScriptlessJSPs/index.jsp">index page</a>
    </body>
</html>