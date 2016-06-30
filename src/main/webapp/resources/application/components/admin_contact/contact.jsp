<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="wrapper">
	<!-- Navigation -->
	<admin-header-left></admin-header-left>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Edit Contact Info</h1>
			</div>
		</div>
		<div id="page-inner">
			<form id="myform" name="myform" action="">
				<div class="form-group">
					<label for="companyname">Company Name :</label> <input type="text"
						id="companyname" name="companyname" ng-model="contact.companyname"
						class="form-control" required />
					<div
						ng-show="myform.companyname.$invalid && !myform.companyname.$pristine"
						class="alert alert-danger">Company name is required</div>
				</div>
				<div class="form-group">
					<label for="address">Address :</label> <input id="address"
						name="address" type="text" ng-model="contact.address"
						class="form-control" required />
					<div ng-show="myform.address.$invalid && !myform.address.$pristine"
						class="alert alert-danger">Address is required</div>
				</div>
				<div class="form-group">
					<label for="number">Phone number :</label> <input id="phone"
						name="phone" type="text" ng-model="contact.phone"
						class="form-control" required />
					<div ng-show="myform.phone.$invalid && !myform.phone.$pristine"
						class="alert alert-danger">Number is required</div>
				</div>
				<div class="form-group">
					<label for="number">Email :</label> <input id="email" name="email"
						type="email" ng-model="contact.email" class="form-control"
						required />
					<div ng-show="myform.email.$invalid && !myform.email.$pristine"
						class="alert alert-danger">Email is required</div>
				</div>
				<div class="col-md-12 form-group" style="padding-left: 0px">
					<div class="col-md-6" style="padding-left: 0px">
						<label for="number">Latitude :</label> <input id="mapX"
							name="mapX" type="text" ng-model="contact.mapX"
							class="form-control" required />
						<div ng-show="myform.mapX.$invalid && !myform.mapX.$pristine"
							class="alert alert-danger">Latitude is required</div>
					</div>
					<div class="col-md-6">
						<label for="number">Longitude :</label> <input id="mapY"
							name="mapY" type="text" ng-model="contact.mapY"
							class="form-control" required />
						<div ng-show="myform.mapY.$invalid && !myform.mapY.$pristine"
							class="alert alert-danger">Longitude is required</div>
					</div>
				</div>
				<div class="form-group">
					<label for="number">Working Time :</label> <input id="workingtime"
						name="workingtime" type="text" ng-model="contact.workingtime"
						class="form-control" required />
					<div
						ng-show="myform.workingtime.$invalid && !myform.workingtime.$pristine"
						class="alert alert-danger">Working time is required</div>
				</div>
				<div class="form-group">
					<label for="number">Zoom map :</label> <input id="zoommap"
						name="zoommap" type="number" ng-model="contact.zoommap"
						class="form-control" required />
					<div ng-show="myform.zoommap.$invalid && !myform.zoommap.$pristine"
						class="alert alert-danger">Zoom map is required</div>
				</div>
				<div class="form-group">
					<label for="number">Banner Footer :</label> TBC
				</div>
				<div class="form-group">
					<label for="number">About Us :</label>
					<div text-angular="text-angular" name="aboutus"
						ng-model="contact.aboutus" ta-disabled='disabled' required></div>
					<div ng-show="myform.aboutus.$invalid && !myform.aboutus.$pristine"
						class="alert alert-danger">About us is required</div>
				</div>

				<div class="form-group">
					<label for="number">Slogan :</label>
					<div text-angular="text-angular" name="slogan"
						ng-model="contact.slogan" ta-disabled='disabled' required></div>
					<div ng-show="myform.slogan.$invalid && !myform.slogan.$pristine"
						class="alert alert-danger">Slogan is required</div>
				</div>

				<button type="submit" ng-click="submit($event)" id="updatePassword"
					class="btn btn-default">Update</button>
			</form>
		</div>
	</div>
</div>


