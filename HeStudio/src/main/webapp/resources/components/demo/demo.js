app.directive('demo', function(demoService) {
	return {
		restrict : 'AE',
		replace : true,
		templateUrl : 'resources/components/demo/demo.jsp',
		scope : {},
		controller : function($scope, $element) {
			var self = this;
			self.user = {};
			self.users = [];

			self.fetchAllUsers = function() {
				demoService.fetchAllUsers().then(function(d) {
					self.users = d;
				}, function(errResponse) {
					console.error('Error while fetching Currencies');
				});
			};

			self
		},
		link : function() {

		}
	}
});