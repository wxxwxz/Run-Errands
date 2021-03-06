<%@ page import="wxx.entity.UserEntity" %><%--
  Created by IntelliJ IDEA.
  User: wuxuezi
  Date: 2019/6/6
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="css/user/user_normal.css">
<link rel="stylesheet" href="css/button.css">


<body>
<div class="container">
    <form class="form-signin">
        <div class="panel panel-default">
            <div class="panel-heading">
                <div class="row">
                    <div class="col-md-5"><h2>用户登录</h2></div>
                    <div class="col-md-5"></div>
                    <div class="col-md-2"><br>
                        <button type="button" class="button button-primary button-circle" onclick="go_to_register()">注册</button>
                    </div>
                </div>
            </div>
            <div class="panel-body">
                <label for="username">用户名</label>
                <input type="text" id="username" class="form-control" placeholder="Username" name="username" required autofocus>
                <br>
                <label for="password">密 码</label>
                <input type="password" id="password" class="form-control" placeholder="Password" name="password" required>
                <br>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me" id="remb"> 记住密码
                    </label>
                </div>
                <br>
                <button type="button" type="button" class="btn btn-lg btn-primary btn-block" id="loginBtn">登录</button>
                <button type="button" type="button" class="btn btn-lg btn-primary btn-block" onclick="go_to_manager()">管理员登录</button>
            </div>
        </div>
    </form>

</div>
<script src="js/jquery/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap/bootstrap.min.js"></script>
<script src="js/common/ajaxfunc.js"></script>
<script src="js/user/user_login.js"></script>
</body>
</html>
