<%@page import="com.litinow.utils3.Person" %>
<html><body>

<br><br>
By request parameter:
<br>
Hello
<%= request.getParameter("username") %>

<br><br>
By request attribute:
<br>
Hello
<%= request.getAttribute("name") %> 

<br><br>
Scripting sample:
<br>
<% Person p = (Person) request.getAttribute("person"); %>
Person is: <%= p.getName() %>
<br><br>
Expression Sample
<br>
Person is:
<%= ((Person) request.getAttribute("person")).getName() %>
<br><br>
Standard actions Sample
<br>
<jsp:useBean id="person" class="com.litinow.utils3.Person" scope="request" />
Person created by servlet: <jsp:getProperty name="person" property="name" />
</body></html>