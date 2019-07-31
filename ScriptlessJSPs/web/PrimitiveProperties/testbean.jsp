<html><body>
<%-- If you name the property but don't specify a value or param, you're telling the Container to
get the value from a request parameter with a matching name. --%>

<jsp:useBean id="person" type="com.litinow.utils2.Person" class="com.litinow.utils2.Employee">
	<jsp:setProperty name="person" property="*" />
</jsp:useBean>

Person: <jsp:getProperty name="person" property="name" />
<jsp:getProperty name="person" property="id" />
</body></html>