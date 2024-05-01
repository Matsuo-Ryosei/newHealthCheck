<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String test = "1";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>
	<h1>スッキリ健康診断の結果</h1>
	<p>
	テスト：${health}<br>
	身長：<c:out value="${health.getHeight()}" />cm<br>
	体重：<c:out value="${health.getWeight()}" />kg<br>
	BMI：<c:out value="${health.getBmi()}" /><br>
	体格：<c:out value="${health.getBodyType()}" />
</p>
<a href="/heath_check_textbook/HealthCheck">戻る</a>
</body>
</html>