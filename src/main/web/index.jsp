<%--
  Created by IntelliJ IDEA.
  User: Jaeyeop
  Date: 10/9/2020
  Time: 11:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Spring REST</title>
</head>
<body>
<h3>Spring REST Demo</h3>

<hr>

<a href="${pageContext.request.contextPath}/hello">Hello</a>
<br><br>
<a href="${pageContext.request.contextPath}/api/students">Get All Students</a>

</body>
</html>
