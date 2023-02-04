<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>    


<html>
<head>
<meta charset=UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="mistyrose">
      <td ><b>아이디</b></td>
      <td><b>비밀번호</b></td>
      <td><b>이름</b></td>
      <td><b>번호</b></td>
      <td><b>주소</b></td>
      <td><b>삭제</b></td>
   </tr>
   
 <c:forEach var="member" items="${memberList}" >     
   <tr align="center">
      <td>${member.userid}</td>
      <td>${member.pwd}</td>
      <td>${member.name}</td>
      <td>${member.phone}</td>
      <td>${member.address}</td>
      <td><a href="${contextPath}/member/removeMember.do?id=${member.userid }">삭제하기</a></td>
    </tr>
  </c:forEach>   
</table>
<a  href="${contextPath}/member/memberForm.do"><h1 style="text-align:center">회원가입</h1></a>
</body>
</html>
