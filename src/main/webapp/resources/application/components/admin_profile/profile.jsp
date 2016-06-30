<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="wrapper">
	<admin-header-left></admin-header-left>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Edit User Profile</h1>
			</div>
		</div>
		<div id="page-inner">
			<form id="adminprofile" name="adminprofile" action="">
				<div class="form-group">
					<label for="name">Username :</label> 
					<input type="text" name="username" ng-model="username" class="form-control" required/>
					<div ng-show="adminprofile.username.$invalid && !adminprofile.username.$pristine"
						class="alert alert-danger">Username is required</div>
				</div>
				<div class="form-group">
					<label for="password">Password :</label> <input id="password"
						type="password" ng-model="password" name="password" class="form-control" required />
					<div ng-show="adminprofile.password.$invalid && !adminprofile.password.$pristine"
						class="alert alert-danger">Password is required</div>
				</div>
				<div class="form-group">
					<label for="name">Password-Retype :</label> <input
						id="passwordRetype" type="password" name="passwordRetype" ng-model="passwordRetype"
						class="form-control" required />
					<div ng-show="adminprofile.passwordRetype.$invalid && !adminprofile.passwordRetype.$pristine"
						class="alert alert-danger">Password Retype is required</div>
					<div class="alert alert-danger" role="alert"
						ng-show="errorPasswordMatch">{{errorPasswordMatch}}</div>
				</div>
				<button type="button" ng-click="submit()" id="updatePassword"
					class="btn btn-default">Update</button>
			</form>
		</div>
	</div>
</div>

