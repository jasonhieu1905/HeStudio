app
		.directive(
				'adminContact',
				function(contactService, $cookieStore) {
					return {
						restrict : 'AE',
						replace : true,
						templateUrl : 'resources/application/components/admin_contact/contact.jsp',
						scope : {},
						controller : function($scope, $cookieStore) {
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
								aboutus : ""

							};

							contactService
									.getContactInfo()
									.then(
											function(data) {
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
							}
						},
						link : function() {

						}
					}
				});