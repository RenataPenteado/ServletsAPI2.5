<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class='tipBox'>
    <b>Tip of the Day:</b> <br/> <br/>
    <c:out value='${pageContent.currentTip}' escapeXml='true' />
    <hr>
    <c:out value='${pageContent.currentTip}' escapeXml='false' />
    <hr>
    <a href="/CustomTagsAndJSTL/index.jsp">Back to index</a>
</div>