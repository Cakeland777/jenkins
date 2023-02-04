<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<c:url value='/js/scriptTest.js'/>"></script>
</head>
<body>
${message }
<img src="<c:url value='/image/cat.jpg'/>"><br/>
<button type="button"   onclick="test()">테스트</button>
</body>
</html>