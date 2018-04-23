<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/19
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<form action="/account/login" method="post">
    用户名 ：<input type="text" name="username">
    密  码 ：<input type="text" name="password" >
    <input type="submit" value="登录"> <a href="registered.jsp"><input type="button" value="注册"></a>&nbsp;<a href="forget.jsp">忘记密码</a>
</form>

</body>
</html>
