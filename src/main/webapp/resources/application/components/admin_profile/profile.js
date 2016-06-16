app.directive('adminprofile', function ($cookieStore) {
    return {
        restrict: 'AE',
        replace: true,
        templateUrl: 'resources/application/components/admin_profile/profile.jsp',
        scope: {},
        controller: function ($scope,$cookieStore) {
        	debugger;
        	var user = $cookieStore.get("username");
        	$scope.username = user.username;
        	$scope.password = $cookieStore.get("password");
        	$scope.passwordRetype = $cookieStore.get("password");
        },
        link: function () {

        }
    }
});