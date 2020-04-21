<%--
  Created by IntelliJ IDEA.
  User: nadee
  Date: 2020-03-23
  Time: PM 1.24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>objects</title>
</head>
<body>
http://localhost:8080/objects.jsp?name=kkk
<br>

<%
    String userName = request.getParameter("name");

    if(userName!= null){
        session.setAttribute("sessionUserName", userName);
        application.setAttribute("applicationUserName",userName);
//        pageContext.setAttribute("PageUserName",userName);
    }
%>
<br>
request object username is: <%=userName%>
<br>
session object username is: <%=session.getAttribute("sessionUserName")%>
<br>
application context object username is: <%=application.getAttribute("applicationUserName")%>

</body>
</html>
