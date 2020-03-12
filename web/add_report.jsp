<%--
  Created by IntelliJ IDEA.
  User: wuxuezi
  Date: 2019/12/24
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>举报</title>
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
                    <div class="col-md-9 top-text">添加举报</div>
                    <div class="col-md-2 row">
                        <div class="col-md-6 top-text" id="userId">userId</div>
                    </div>
                </div>
            </div>
            <div class="panel-body">
                <label for="course">原 因</label>
                <input type="text" id="course" class="form-control" placeholder="Course" name="course" required autofocus>
                <br>
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
</script>
<script src="js/user_oper/add_report.js"></script>
</body>
</html>
