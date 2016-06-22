<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container">
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
							<form id="login-form" name="login" role="form"
								style="display: block;">
								<div class="form-group">
									<input type="text" required="required" ng-model="username"
										name="username" id="username" tabindex="1"
										class="form-control" placeholder="Username" value="">

								</div>
								<div class="form-group">
									<input type="password" required="required" ng-model="password"
										name="password" id="password" tabindex="2"
										class="form-control" placeholder="Password">
								</div>
								<div class="alert alert-danger" role="alert"
									ng-show="errorMessage">{{errorMessage}}</div>
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
											<input type="submit" ng-click="submit($event)"
												name="login-submit" id="login-submit" tabindex="4"
												class="form-control btn btn-login" value="Log In">
										</div>
									</div>
								</div>

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

