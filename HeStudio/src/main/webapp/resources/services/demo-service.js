app.service("demoService", function($http, $q) {
	return {
		fetchAllUsers : function() {
			return $http.get(contextPath + "/users/").then(function(response) {
				return response.data;
			}, function(errResponse) {
				console.error('Error while fetching users');
				return $q.reject(errResponse);
			});
		}

	}
});