<%@ page isErrorPage="true" %>
<html>
<body>
<h1>Demo de Segurança J2EE (Form)<hr></h1>
<p>
Você não tem acesso à página:
<br>
<%= request.getRequestURL() %>
<p>
<a href="<%= request.getContextPath() %>">Voltar...</a>
</body>
</html>
