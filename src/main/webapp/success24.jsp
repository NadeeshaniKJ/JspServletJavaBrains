<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h3>Login Successful</h3>

<jsp:useBean id="user" class="com.kanchi.servlet.t18Login.dto.User" scope="request">
    <jsp:setProperty name="user" property="userName" value="NewUser"/>
</jsp:useBean>

Hello from JSP <%=user.getUserName()%>!

Hello from JSTL  <jsp:getProperty name="user" property="userName"/>

</body>
</html>
