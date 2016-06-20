app.directive('adminProfile', function ($cookieStore) {
	function checkEmpty(field,message){
		if (!field) {
			message = "This field is required";
	    	return false;
	    }else{
	    	message = "";
	    }
		return true;
	}
    return {
        restrict: 'AE',
        replace: true,
        templateUrl: 'resources/application/components/admin_profile/profile.jsp',
        scope: {},
        controller: function ($scope) {
        	var user = $cookieStore.get("user");
        	$scope.username = user.username;
        	$scope.password = $cookieStore.get("password");
        	$scope.passwordRetype = $cookieStore.get("password");
        	$scope.requireName = true;
        	$scope.submit = function () {
        		console.log($scope.username);
        	
            }
        },
        link: function () {

        }
    }
});
