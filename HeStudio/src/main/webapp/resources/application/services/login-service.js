app.service("loginService", function($http, $q) {
	return {
		loginWithUsername : function(info) {
            var defer = $q.defer();
            var url = contextPath + "/users";
            $http({
                url: url,
                method: 'GET',
                params: info
            }).then(function (result) {
                    defer.resolve(result.data);
                }, function (error) {
                    defer.reject(error);
                }
            );
            return defer.promise;
		}

	}
});