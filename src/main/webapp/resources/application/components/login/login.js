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

$(function() {

    $('#login-form-link').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	$('#register-form-link').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

});