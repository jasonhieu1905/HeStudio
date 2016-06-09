<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html ng-app="hestudio">
<head>
	<title>Hestudio</title>
	<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.css'/>" type="text/css">
	<link rel="stylesheet" href="<c:url value='/resources/application/components/login/login.css'/>" type="text/css">
	<link rel="stylesheet" href="<c:url value='resources/application/components/home/home.css'/>" type="text/css">
	<script>
		var contextPath = "/HeStudio"
	</script>
</head>
<body ng-controller="appCtrl">
	
	<div ng-view></div>

	<script src="<c:url value='/resources/js/jquery-1.10.2.js'/>"></script>
	<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/resources/js/angular.js'/>"></script>
	<script src="<c:url value='/resources/js/angular-route.min.js'/>"></script>

	<script src="<c:url value='/resources/application/app.js' />"></script>
	<script src="<c:url value='/resources/application/components/login/login.js' />"></script>
	<script src="<c:url value='/resources/application/components/home/home.js' />"></script>
	
	<script src="<c:url value='/resources/application/services/login-service.js' />"></script>
</body>
</html>