<html>
<body>
<%! int doubleCount() {
count = count*2;
return count;
}
%>
<%! int count=1; %>
The page count is now:
<%= doubleCount() %>
<br />
<a href="../index.jsp">Back to index</a>
</body>
</html>