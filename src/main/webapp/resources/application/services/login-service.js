app.service("loginService", function($http, $q,$cookieStore,$location) {
	return {
		loginWithUsername : function(info) {
			var defer = $q.defer();
			var url = contextPath + "/users";
			$http({
				url : url,
				method : 'POST',
				params : info
			}).then(function(result) {
				defer.resolve(result.data);
			}, function(error) {
				defer.reject(error);
			});
			return defer.promise;
		},
		updateAdminAccount : function(info) {
			var defer = $q.defer();
			var url = contextPath + "/updateAdminAccount";
			$http({
				url : url,
				method : 'POST',
				params : info
			}).then(function(result) {
				defer.resolve(result.data);
			}, function(error) {
				defer.reject(error);
			});
			return defer.promise;
		},

		logout : function() {
			$cookieStore.remove("user");
			$cookieStore.remove("password");
			$location.path("/login");
		}

	}

});