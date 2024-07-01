<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>首页</title>
</head>
<body>

<a href="account/getAll">测试查询</a>

<form action="account/save" method="post">
    姓名：<input type="text" name="name"><br/>
    金额：<input type="text" name="money"><br/>
    <input type="submit" value="保存"><br/>
</form>

</body>
</html>