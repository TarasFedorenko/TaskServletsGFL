<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 13.11.2023
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <jsp:useBean id="calculate" class="com.geeksforless.tfedorenko.taskservletsgfl.beans.CalculateFunction" scope="request"/>
    <h2> For x = ${calculate.x} result is  ${calculate.calculateBX()}</h2>
</body>
</html>
