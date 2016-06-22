app.directive(
				'adminProfile',
				function(loginService,$location,$cookieStore) {
					return {
						restrict : 'AE',
						replace : true,
						templateUrl : 'resources/application/components/admin_profile/profile.jsp',
						scope : {},
						controller : function($scope) {
							if($cookieStore.get("user") == undefined){
				        		$location.path("/login")
				        	}
							
							var user = $cookieStore.get("user");
							$scope.username = user.username;
							$scope.password = $cookieStore.get("password");
							$scope.passwordRetype = $cookieStore
									.get("password");
							$scope.requireName = true;
							$scope.submit = function() {
								event.preventDefault();
								for ( var input in $scope.adminprofile) {
									if ($scope.adminprofile[input]
											&& $scope.adminprofile[input].$pristine) {
										$scope.adminprofile[input].$pristine = false;
										return ;
									}
								}
								
								if($scope.adminprofile.$invalid){
									return;
								}

								if ($scope.password != $scope.passwordRetype) {
									$scope.errorPasswordMatch = "Password Retype doesn't match";
									return;
								}
								
								var info = {
									username: $scope.username,
									password: $scope.password,
									id : user.id
								};
								
								loginService.updateAdminAccount(info).then(function (data) {
			                        if(data){
			                        	$location.path("/login");
			                        }else{
			                        	$scope.errorMessage = "Can not update password";
			                        }
			                        
			                    },function(reson){
			                    	$scope.errorMessage = "Can not update password";
			                    });
								
							}
						},
						link : function() {

						}
					}
				});
