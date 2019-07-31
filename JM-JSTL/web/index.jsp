<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${empty sessionScope.usuarioLogado}">
    <c:redirect url="login.jsp"/>
</c:if>

<c:set var="usuario" scope="page" value="${sessionScope.usuarioLogado}"/>

Bem-vindo <c:out value="${usuario.nome}">Usuário Anônimo</c:out>!<br>
<br>

<b>Valores do header</b>
<table border="1" cellspacing="0" cellpading="0">
    <c:forEach items="${pageContext.request.headerNames}" var="parametro" varStatus="status">
        <tr>
            <td><c:out value="${status.count}"/></td>
            <td><c:out value="${parametro}"/></td>
            <td><c:out value="${header[parametro]}"/></td>
        </tr>
    </c:forEach>
</table>

<br>
<br>
<a href="logout.jsp">Logout</a>

