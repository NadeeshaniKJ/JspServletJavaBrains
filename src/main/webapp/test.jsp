<%--
  Created by IntelliJ IDEA.
  User: nadee
  Date: 2020-03-23
  Time: AM 9.21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyTest</title>
</head>
<body>

<h3>Testing JSPs</h3>

<%!
    public int add (int a,int b){
        return a+b;
    }
%>
<%
    int i=1;
    int j=2;
    int k;

    k=i+j;
//    out.println("");  this does not work here as in the tutorial
%>

The value of k is <%=k%><br>
The value of k is <%=34%><br>
The value of k is <%=1+2%><br>
The value of k is <%=1+2%>!!<br>

<%
    k=add(546,455);
%>

<br>

The value of k is now <%=k%>!!<br>

<%
    for(int a=0; a<5;a++){
%>

<br> The new value of a = <%=a%>
<%}%>
</body>
</html>
