<html><body>
Welcome to our page! <br />

<% if (request.getParameter("userName").trim().equals("")) { %>
<jsp:forward page="HandleIt.jsp" />
<% } %>
Hello ${param.userName}

<br><br>
<a href="../index.jsp">Back to index</a>
</body></html>