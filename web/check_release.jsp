<%--
  Created by IntelliJ IDEA.
  User: wuxuezi
  Date: 2019/12/23
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>当前未接单</title>
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
    <style>
        body{
            background-color: #f9f9f9;
        }
        .top{
            height: 60px;
            background-color: #ffffff;
            margin-bottom: 40px;
        }
        .top > div{
            display: flex;
            align-items: center;
            height: 60px;
        }
        .top-text{
            color: #65508f;
            font-size: 18px;
        }
        .scroll{
            width: 50%;
            height: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 4px;
            overflow-y: scroll;
        }
        .btn{
            color: #65508f;
            border: none;
        }
        .list-group{
            width: 100%;
            margin: 0 auto;
            padding-bottom: 20px;
        }
        .input-group{
            width: 50%;
            margin: 0 auto;
        }
    </style>
</head>
<%
    String userId = (String) session.getAttribute(session.getId());
%>
<body>
<div>
    <div class="top row">
        <div class="col-md-1"></div>
        <div class="col-md-9 top-text">当前审核单</div>
    </div>
    <div class="scroll">
        <ul class="list-group" id="check_list"></ul>
    </div>
</div>
<script src="js/jquery/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap/bootstrap.min.js"></script>
<script src="js/common/ajaxfunc.js"></script>
<script src="js/manager_oper/check_release.js"></script>
</body>
</html>
