<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculate Function</title>
</head>
<body>
<h1><%= "Calculate function" %>
</h1>
<br/>
<form action="calculate-servlet" method="post">
    <label>
        <input type="text" name="x" step="any">
    </label>
    <input type="submit" value="Calculate">
</form>
</body>
</html>