app.directive('adminHeader', function (loginService,$location,$cookieStore) {
    return {
        restrict: 'AE',
        replace: true,
        templateUrl: 'resources/application/components/admin_header/header.jsp',
        scope: {},
        controller: function ($scope, $element) {
        	if($cookieStore.get("user") == undefined){
        		$location.path("/login")
        	}
        	$scope.logout = function(){
        		loginService.logout();
        	};
        },
        link: function () {

        }
    }
});