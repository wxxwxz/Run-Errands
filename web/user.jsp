<%--
  Created by IntelliJ IDEA.
  User: wuxuezi
  Date: 2019/6/7
  Time: 5:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户主页</title>
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
                    <div class="col-md-5"><h2>用户主页</h2></div>
                    <div class="col-md-5"></div>
                </div>
            </div>
            <div class="panel-body">
                <div class="col-md-12"><br>
                    <button  type="button" class="btn btn-lg btn-primary btn-block" onclick="go_to_receive()">去接单</button>
                </div>

                <div class="col-md-12"><br>
                    <button  type="button" class="btn btn-lg btn-primary btn-block" onclick="go_to_release()">去发单</button>
                </div>
                <div class="col-md-12"><br>
                    <button  type="button" class="btn btn-lg btn-primary btn-block" onclick="my_rele_deal()">我的发单</button>
                </div>
                <div class="col-md-12"><br>
                    <button  type="button" class="btn btn-lg btn-primary btn-block" onclick="my_rece_deal()">我的接单</button>
                </div>
                <div class="col-md-12"><br>
                    <button  type="button" class="btn btn-lg btn-primary btn-block" onclick="my_report()">我的举报</button>
                </div>

            </div>
        </div>
    </form>

</div>
<script src="js/jquery/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap/bootstrap.min.js"></script>
<script src="js/common/ajaxfunc.js"></script>
<script src="js/user_oper/user.js"></script>
</body>
</html>
