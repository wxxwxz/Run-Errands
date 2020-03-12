<%@ page import="wxx.entity.UserEntity" %><%--
  Created by IntelliJ IDEA.
  User: wuxuezi
  Date: 2019/6/7
  Time: 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发单</title>
</head>
<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="css/user/user_normal.css">
<link rel="stylesheet" href="css/button.css">
<%
    String userId = (String) session.getAttribute(session.getId());
%>
<body>
<div class="container">

    <form class="form-signin">
        <div class="panel panel-default">
            <div class="panel-heading">
                <div class="top row">
                    <div class="col-md-1"></div>
                    <div class="col-md-9 top-text">发单</div>
                    <div class="col-md-2 row">
                        <div class="col-md-6 top-text" id="userId">userId</div>
                    </div>
                </div>
            </div>
            <div class="panel-body">
                <label for="description">描 述</label>
                <input type="text" id="description" class="form-control" placeholder="Description" name="description" required autofocus>
                <br>
                <label for="price">价 格</label>
                <input type="text" id="price" class="form-control" placeholder="Price" name="price" required>
                <br>
                <%--<label for="userID">发单人</label>
                <input type="text" id="userID" class="form-control" placeholder="UserID" name="userID" required>
                <br>--%>
                <button type="button" class="btn btn-lg btn-primary btn-block" id="add_btn">确定</button>
            </div>
        </div>
    </form>

</div>
<script src="js/jquery/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap/bootstrap.min.js"></script>
<script src="js/common/ajaxfunc.js"></script>
<script>
    var userId = '<%=userId%>'
        $("#userId").text(userId)
    $("#log").text(userId==-1?'Login':'Logout')
</script>
<script src="js/user_oper/add_release.js"></script>
</body>
</html>
