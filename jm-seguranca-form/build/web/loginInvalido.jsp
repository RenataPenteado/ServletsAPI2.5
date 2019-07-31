<html>
<body>
<h1>Demo de Segurança J2EE (Form)<hr></h1>
<p>
Login ou senha incorretos.
<p>
<a href="<%= request.getSession().getAttribute("pagina") %>">Tentar novamente...</a>
<p>
<a href="<%= request.getContextPath() %>">Voltar...</a>
</body>
</html>
