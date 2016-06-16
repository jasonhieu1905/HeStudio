app.directive('adminprofile', function ($rootScope) {
    return {
        restrict: 'AE',
        replace: true,
        templateUrl: 'resources/application/components/admin_profile/profile.jsp',
        scope: {},
        controller: function ($scope, $element,$rootScope) {
        	debugger;
        	var user = $rootScope.user;
        	$scope.username = user.username;
        	$scope.password = $rootScope.password;
        	$scope.passwordRetype = $rootScope.password;
        },
        link: function () {

        }
    }
});