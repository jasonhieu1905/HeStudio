<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html ng-app="hestudio">
<head>
<title>Hestudio</title>
<link rel="stylesheet"
	href="<c:url value='resources/css/bootstrap.css'/>" type="text/css">
<link rel="stylesheet" href="<c:url value='resources/application/app.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/css/font-awesome.css'/>" type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/css/slide-down-box-menu-style.css'/>"
	type="text/css">

<!-- Link to Admin -->
<link rel="stylesheet"
	href="<c:url value='resources/application/components/login/login.scss'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/application/components/home/home.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/application/components/admin_home/home.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/css/admin/metisMenu.min.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/css/admin/morris.css'/>" type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/css/admin/sb-admin-2.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/css/admin/timeline.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/css/admin/texteditor.css'/>"
	type="text/css">
<link rel="stylesheet"
	href="<c:url value='resources/css/admin/ngTable/ng-table.min.css'/>"
	type="text/css">

<!-- Link To Customer -->
<link rel="stylesheet"
	href="<c:url value='resources/application/components/header-page/header-page.css'/>"
	type="text/css">
<script>
	var contextPath = "/HeStudio"
</script>


</head>
<body ng-controller="appCtrl" style="padding-top: 0px">

	<div ng-view></div>

	<script src="<c:url value='resources/js/jquery-1.10.2.js'/>"></script>
	<script src="<c:url value='resources/js/jquery.easing.1.3.js'/>"></script>
	<script src="<c:url value='resources/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='resources/js/angular.js'/>"></script>
	<script src="<c:url value='resources/js/angular-route.min.js'/>"></script>

	<!-- Link to Admin -->
	<script src="<c:url value='resources/application/app.js' />"></script>
	<script
		src="<c:url value='resources/application/components/login/login.js' />"></script>
	<script
		src="<c:url value='resources/application/components/admin_home/home.js' />"></script>
	<script
		src="<c:url value='resources/application/components/admin_header/admin-header.js' />"></script>
	<script
		src="<c:url value='resources/application/components/admin_left/admin-left.js' />"></script>
	<script
		src="<c:url value='resources/application/components/admin_profile/admin-profile.js' />"></script>
	<script
		src="<c:url value='resources/application/components/admin_contact/admin-contact.js' />"></script>
	<script
		src="<c:url value='resources/application/components/admin_banner/admin-banner.js' />"></script>

	<!-- Link to Admin Resources -->
	<script src="<c:url value='resources/js/admin/metisMenu.min.js' />"></script>
	<script src="<c:url value='resources/js/admin/morris.min.js' />"></script>
	<script src="<c:url value='resources/js/admin/raphael-min.js' />"></script>
	<script src="<c:url value='resources/js/admin/sb-admin-2.js' />"></script>
	<script
		src="<c:url value='resources/js/admin/texteditor/textAngular.min.js' />"></script>
	<script
		src="<c:url value='resources/js/admin/texteditor/textAngular-sanitize.min.js' />"></script>
	<script
		src="<c:url value='resources/js/admin/ngTable/ng-table.js' />"></script>

	<!-- Link to Customer -->
	<script
		src="<c:url value='resources/application/components/header-page/header-page.js' />"></script>
	<script
		src="<c:url value='resources/application/components/home/home.js' />"></script>
	<script
		src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.0/angular-cookies.js"></script>

	<!-- Link to Service -->
	<script
		src="<c:url value='resources/application/services/login-service.js' />"></script>
	<script
		src="<c:url value='resources/application/services/contact-service.js' />"></script>
	<script
		src="<c:url value='resources/application/services/banner-service.js' />"></script>


</body>
</html>
