<%--
  Created by IntelliJ IDEA.
  User: nadee
  Date: 2020-03-23
  Time: PM 5.16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>init</title>
</head>



<body>

<%--
<%!
    public void jspInit(){

        String defaultUser =getServletconfig.getInitParameter("dafaultUser");
        ServletContext context= getServletContext();
        context.setAttribute("defaultUser",defaultUser);
    }
%>
--%>

  The default user from the servlet config is:  <%=config.getInitParameter("dafaultUser")%>
  The value in the Servlet Context is : <%=application.getAttribute("defaultUser")%>
</body>
</html>
