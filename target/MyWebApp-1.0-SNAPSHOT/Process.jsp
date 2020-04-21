<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<h3>Login Successful</h3>

<jsp:useBean id="user" class="com.kanchi.servlet.t25.User25" scope="request">
   <%-- <jsp:setProperty name="user" property="userName"/>
    <jsp:setProperty name="user" property="userId"/>
    <jsp:setProperty name="user" property="address1"/>--%>

    <jsp:setProperty name="user" property="*"/>
</jsp:useBean>

Hello  <jsp:getProperty name="user" property="userName"/>
UserId <jsp:getProperty name="user" property="userId"/>
Address 1 <jsp:getProperty name="user" property="address1"/>
Address 2 <jsp:getProperty name="user" property="address2"/>
City <jsp:getProperty name="user" property="city"/>
State <jsp:getProperty name="user" property="state"/>
Pincode <jsp:getProperty name="user" property="pincode"/>

</body>
</html>
