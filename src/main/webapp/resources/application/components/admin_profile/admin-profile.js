app.directive('adminProfile', function ($cookieStore) {
    return {
        restrict: 'AE',
        replace: true,
        templateUrl: 'resources/application/components/admin_profile/profile.jsp',
        scope: {},
        controller: function ($scope,$cookieStore) {
        	var user = $cookieStore.get("user");
        	$scope.username = user.username;
        	$scope.password = $cookieStore.get("password");
        	$scope.passwordRetype = $cookieStore.get("password");
        	
        	$scope.submit = function ($event) {
            	$event.preventDefault();
                $scope.login.$setDirty;
                if ($scope.login.$valid) {
                    var info = {
                        username: $scope.username,
                        password: $scope.password,
                        id: ""
                    };
                    loginService.loginWithUsername(info).then(function (data) {
                        if(data){
                        	$cookieStore.put("user",data);
                        	$cookieStore.put("password", $scope.password);
                        	$location.path("/adminhome")
                        	$scope.errorMessage="";
                        }else{
                        	$scope.errorMessage = "Username or password is not correct"
                        }
                        
                    },function(reson){
                    	$scope.errorMessage = "Username or password can not be empty"
                    });
                }

            }
        },
        link: function () {

        }
    }
});