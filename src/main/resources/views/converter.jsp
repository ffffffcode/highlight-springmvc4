<%--
  Created by IntelliJ IDEA.
  User: AaronFae
  Date: 2018/3/17
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>converter</title>
    <script src="assets/js/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script>
        function req() {
            $.ajax({
                url: "convert",
                data: "1-af",
                type: "POST",
                contentType: "application/x-wisely",
                success: function (data) {
                    $("#resp").html(data);
                }
            });
        }
    </script>
</head>
<body>
<div id="resp"></div>
<input type="button" onclick="req()" value="请求">
</body>
</html>
