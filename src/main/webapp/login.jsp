<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="content">
    <div class="login-wrap">
        <form id="user_login" action="">
            <h3>登 录</h3>
            <input class="name" name="" id="accountName" type="text" placeholder="请输入用户名">
            <input class="code" name="password" id="password" type="password" placeholder="请输入密码">
            <div class="btn">
                <input type="button" id="submit" class="submit" value="登录" onclick="check()">
                <input type="reset" id="reset"  class="reset" value="重置" >
            </div>
        </form>
    </div>
</div>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
<script>
    //验证表单是否为空，若为空则将焦点聚焦在input表单上，否则表单通过，登录成功
    function check() {
        var accountName = $("#accountName"), $password = $("#password");
        var accountName = accountName.val(), password = $password.val();
        if (!accountName || accountName == "") {
            showMsg("请输入用户名");
            form.accountName.focus();
            return false;
        }
        if (!password || password == "") {
            showMsg("请输入密码");
            form.password.focus();
            return false;
        }
        //这里为用ajax获取用户信息并进行验证，如果账户密码不匹配则登录失败，如不需要验证用户信息，这段可不写
        $.ajax({
            url: "/account/login",// 获取自己系统后台用户信息接口
            data: {"password": password, "username": accountName},
            type: "post",
            dataType: "json",
            success: function (data) {
                if (data) {
                    if (data.code == "1111") { //判断返回值，这里根据的业务内容可做调整
                        setTimeout(function () {//做延时以便显示登录状态值
                            showMsg("正在登录中...");
                            console.log(data);
                            window.location.href = url;//指向登录的页面地址
                        }, 100)
                    } else {
                        showMsg(data.message);//显示登录失败的原因
                        return false;
                    }
                }
            },
            error: function (data) {
                showMsg(data.message);
            }
        });
    }

    //错误信息提醒
    function showMsg(msg){
        $("#CheckMsg").text(msg);
    }
</script>
</body>
</html>

