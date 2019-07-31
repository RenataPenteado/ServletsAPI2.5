<%-- 
    Document   : TestSelectTag
    Created on : Mar 19, 2019, 11:14:32 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList, java.util.List"%>
<%@taglib prefix="mine" uri="LitinowClassicTag" %>
<%@taglib prefix="select" uri="LitinowSelectTag"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SelectTagsHandler</title>
    </head>
    <body>
        <%!
            int count = 0;
            List<String> arrayList;
        %>
        <%
            arrayList = (ArrayList<String>) application.getAttribute("attrArrayList");
            if( arrayList == null){
                arrayList = new ArrayList<String>();
                arrayList.add("Data " + count++);
            }else{
                arrayList.add("Data " + count++);
            }
            application.setAttribute("attrArrayList", arrayList);
        %>


        <select:selectTag name="Renata" optionsList="${applicationScope.attrArrayList}" size="5" />

    </body>
</html>
