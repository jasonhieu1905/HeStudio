app
		.directive(
				'adminContact',
				function(contactService, $cookieStore, $location) {
					return {
						restrict : 'AE',
						replace : true,
						templateUrl : 'resources/application/components/admin_contact/contact.jsp',
						scope : {},
						controller : function($scope, $cookieStore) {
							if ($cookieStore.get("user") == undefined) {
								$location.path("/login")
							}
							
							var user = $cookieStore.get("user");
							$scope.username = user.username;
							$scope.password = $cookieStore.get("password");
							$scope.passwordRetype = $cookieStore
									.get("password");
							$scope.contact = {
								id : "",
								companyname : "",
								address : "",
								phone : "",
								email : "",
								mapX : "",
								mapY : "",
								workingtime : "",
								isoimage : "",
								zoommap : "",
								bannerfooter : "",
								aboutus : "",
								slogan : ""

							};

							contactService
									.getContactInfo()
									.then(
											function(data) {
												debugger;
												$scope.contact = data;
											},
											function(reson) {
												$scope.errorMessage = "Can not get contact Info"
											});

							$scope.submit = function($event) {
								event.preventDefault();
								for ( var input in $scope.myform) {
									if ($scope.myform[input]
											&& $scope.myform[input].$pristine) {
										$scope.myform[input].$pristine = false;
									}
								}
								if($scope.myform.$invalid){
									return;
								}
								
								contactService.updateContact($scope.contact).then(function (data) {
									$location.path("/admincontact");
			                    },function(reson){
			                    	$scope.errorMessage = "Can not update contact";
			                    });
							}
						},
						link : function() {

						}
					}
				});

