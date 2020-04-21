<%@ page import="com.kanchi.servlet.t18Login.dto.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h3>Login Successful</h3>

<%
User user = (User)request.getAttribute("user");
%>

Hello <%=user.getUserName()%>!

</body>
</html>
