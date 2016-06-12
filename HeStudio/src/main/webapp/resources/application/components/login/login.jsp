<div class="login-form">
	<div class="panel panel-default">
		<div class="panel-heading">Login</div>
		<div class="panel-body">
		<div class="alert alert-danger" role="alert" ng-show="errorMessage">{{errorMessage}}</div>
		<p>
			<form action="" name="login">
				<input ng-model="username" placeholder="User name" type="text"
					class="form-control" required="required"> <input
					ng-model="password" type="password" placeholder="Password"
					class="form-control" required="required">
				<button class="btn btn-primary" ng-click="submit($event)">Login</button>
				
				

			</form>
		</div>
	</div>

</div>