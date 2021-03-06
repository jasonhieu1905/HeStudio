app.service("contactService", function($http, $q) {
	return {
		getContactInfo : function() {
            var defer = $q.defer();
            var url = contextPath + "/getContact";
            $http({
                url: url,
                method: 'GET'
            }).then(function (result) {
                    defer.resolve(result.data);
                }, function (error) {
                    defer.reject(error);
                }
            );
            return defer.promise;
		},
		updateContact : function(info) {
            var defer = $q.defer();
            var url = contextPath + "/updateContact";
            $http({
                url: url,
                method: 'POST',
                params : info
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