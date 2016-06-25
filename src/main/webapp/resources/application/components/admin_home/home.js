app.directive('adminhome', function ($location,$cookieStore) {
    return {
        restrict: 'AE',
        replace: true,
        templateUrl: 'resources/application/components/admin_home/home.jsp',
        scope: {},
        controller: function ($scope, $element) {
        	if($cookieStore.get("user") == undefined){
        		$location.path("/login")
        	}
        	$scope.data = '<h2>Try me!</h2>';
			$scope.disableForm = false;
        },
        link: function () {

        }
    }
});