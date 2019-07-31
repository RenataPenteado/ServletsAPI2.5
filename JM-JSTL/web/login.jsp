<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="usuario" scope="page" class="jm7.jstl.Usuario">
    <jsp:setProperty name="usuario" property="*"/>
</jsp:useBean>

<html>
    <head><title>Página de login</title></head>
</html>
<body bgcolor="white">

    <br><br>

    <center>
        <h3>Página de login</h3>

        <c:if test="${! empty param.submit}">

            <c:choose>
                <c:when test="${empty usuario.username}">
                    <b>Campo login é obrigatório!</b><br>
                </c:when>
                <c:when test="${empty usuario.senha}">
                    <b>Campo senha é obrigatório!</b><br>
                </c:when>
                <c:when test="${usuario.senha ne usuario.username}">
                    <b>Senha inválida (senha deve ser igual ao login)!</b><br>
                </c:when>
                <c:otherwise>
                    <c:set var="usuarioLogado" scope="session" value="${usuario}"/>
                    <c:redirect url="index.jsp"/>
                </c:otherwise>
            </c:choose>

        </c:if>

        <form method="post"><table>
                <tr>
                    <td align="right">Nome:</td>
                    <td align="left"><input type="text" name="nome" value="<c:out value='${usuario.nome}'/>"</td>
                </tr>
                <tr>
                    <td align="right">Login:</td>
                    <td align="left"><input type="text" name="username" value="<c:out value='${usuario.username}'/>"</td>
                </tr>
                <tr>
                    <td align="right">Senha:</td>
                    <td align="left"><input type="password" name="senha" value="<c:out value='${usuario.senha}'/>"</td>
                </tr>
                <tr>
                    <td align="center" colspan="10">
                    <input type="submit" name="submit" value="Enviar"/></td>
                </tr>

            </table>
        </form>
    </center>
</body>
</html>