<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Spring Boot Sample</title>
</head>

<body>
<form action="${pageContext.request.contextPath}/upload/bpttlt" method="post" enctype="multipart/form-data">
    <input type="file" name="fileTest"/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>