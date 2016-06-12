app.directive('login', function (loginService, $location) {
    return {
        restrict: 'AE',
        replace: true,
        templateUrl: 'resources/application/components/login/login.jsp',
        scope: {},
        controller: function ($scope, $element) {
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
                        	$location.path("/home")
                        	$scope.errorMessage="";
                        }else{
                        	$scope.errorMessage = "Try it again!"
                        	alert("try again!");
                        }
                        
                    },function(reson){
                    	$scope.errorMessage = "Try it again!"
                    });
                }

            }
        },
        link: function () {

        }
    }
});