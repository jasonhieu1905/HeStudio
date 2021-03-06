<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" />

<script src="<c:url value="/resources/js/admin/login.js" />"></script>

<script src="<c:url value='/resources/js/admin/app.js' />"></script>
<script
	src="<c:url value='/resources/js/admin/service/user_service.js' />"></script>
<script
	src="<c:url value='/resources/js/admin/controller/user_controller.js' />"></script>


<title>Login Page</title>
</head>
<body ng-app="myApp" class="ng-cloak" style="padding-top: 90px !important" >
	<div class="container" ng-controller="UserController as ctrl">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-12">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form:form id="login-form" action="login" method="post"
									role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="username" id="username" tabindex="1"
											required="required" class="form-control"
											placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input type="password" name="password" id="password"
											required="required" tabindex="2" class="form-control"
											placeholder="Password">
									</div>
									<c:if test="${not empty error}">
										<div class="alert alert-danger fade in">
											<a href="#" class="close" data-dismiss="alert">&times;</a>
											${error}
										</div>
									</c:if>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit"
													tabindex="4" class="form-control btn btn-login"
													value="Log In">
											</div>
										</div>
									</div>

								</form:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>