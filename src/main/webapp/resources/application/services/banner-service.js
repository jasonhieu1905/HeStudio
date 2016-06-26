app.service("bannerService", function($http, $q) {
	return {
		getAllBanners : function() {
            var defer = $q.defer();
            var url = contextPath + "/getAllBanners";
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
		}
	}
});