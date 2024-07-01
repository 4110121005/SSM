<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>成功页面</title>
</head>
<body>

<h1>成功页面</h1>

<br/>
<c:forEach items="${accounts}" var="account">
    ${account.name}
    ${account.money}
    <br/>
</c:forEach>
</body>
</html>