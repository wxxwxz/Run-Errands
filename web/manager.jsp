<%--
  Created by IntelliJ IDEA.
  User: wuxuezi
  Date: 2019/12/23
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员</title>
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
                    <div class="col-md-5"><h2>管理员主页</h2></div>
                    <div class="col-md-5"></div>
                </div>
            </div>
            <div class="panel-body">
                <div class="col-md-12"><br>
                    <button  type="button" class="btn btn-lg btn-primary btn-block" onclick="go_to_check()">去审核</button>
                </div>

                <div class="col-md-12"><br>
                    <button  type="button" class="btn btn-lg btn-primary btn-block" onclick="go_to_solve()">查看举报</button>
                </div>

            </div>
        </div>
    </form>

</div>
<script src="js/jquery/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap/bootstrap.min.js"></script>
<script src="js/common/ajaxfunc.js"></script>
<script src="js/manager_oper/manager.js"></script>
</body>
</html>
