<%@ page import="java.util.*" %>

<html><body>
The friends who share your hobby of 
<b><%= request.getParameter("hobby") %></b>
are: <br>

<% ArrayList al = (ArrayList) request.getAttribute("names"); %>
 
<% Iterator it = al.iterator(); 
while(it.hasNext()) { %>
	<%= it.next() %>
<br>
<% } %>

</body></html>