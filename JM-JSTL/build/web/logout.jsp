<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:remove var="usuarioLogado" scope="session"/>
<c:redirect url="login.jsp"/>
