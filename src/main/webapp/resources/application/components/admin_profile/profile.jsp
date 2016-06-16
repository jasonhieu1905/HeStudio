<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="wrapper">
	<!-- Navigation -->
	<nav class="navbar navbar-default navbar-static-top" role="navigation"
		style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">Hè Studio</a>
		</div>
		<!-- /.navbar-header -->

		<div ng-include
			src="'resources/application/components/admin_header/header.jsp'"></div>

		<div ng-include
			src="'resources/application/components/admin_left/left.jsp'"></div>
	</nav>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Edit User Profile</h1>
			</div>
		</div>
		<div id="page-inner">
			<form id="myform" action="">
				<div class="form-group">
					<label for="name">Username :</label> <input type="text"
						id="username" ng-model="username" class="form-control" />
				</div>
				<div class="form-group">
					<label for="name">Password :</label> <input id="password"
						type="password" ng-model="password" class="form-control" />
				</div>
				<div class="form-group">
					<label for="name">Password-Retype :</label> <input
						id="passwordRetype" type="password" ng-model="passwordRetype"
						class="form-control" />
				</div>
				<button type="submit" id="updatePassword" class="btn btn-default">Update</button>
			</form>
		</div>
	</div>
</div>

