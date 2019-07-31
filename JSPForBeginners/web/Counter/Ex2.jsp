<%@ page import="java.util.*" %>
<html><body>
Test scriptlets...
<% ArrayList list = new ArrayList();
list.add(new String("foo"));
%>
<%= list.get(0) %>
<br />
<a href="../index.jsp">Back to index</a>
</body></html>