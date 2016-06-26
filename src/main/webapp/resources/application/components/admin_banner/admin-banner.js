app
		.directive(
				'adminBanner',
				function(bannerService, $location, $cookieStore) {
					return {
						restrict : 'AE',
						replace : true,
						templateUrl : 'resources/application/components/admin_banner/banner.jsp',
						scope : {},
						controller : function($scope, $element) {
							if ($cookieStore.get("user") == undefined) {
								$location.path("/login")
							}

							bannerService.getAllBanners().then(function(data) {
								if (data) {
									$scope.data = data;
								} else {

								}

							}, function(reson) {
								$scope.errorMessage = "Can not get banners"
							});
							
							$scope.toogleRow = function(e){
								$(e.currentTarget).toggleClass('selected');
							}

						},
						link : function($scope) {
						}
					}
				});