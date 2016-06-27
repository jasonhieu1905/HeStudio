app.directive('objectTable', function ($timeout) {
    return {
        restrict: 'E',
        replace: true,
        templateUrl: 'resources/application/components/object-table/object-table.jsp',
        scope: {
			header:"=",
			data:"="
		},
        controller: function ($scope, $element) {
			$scope.addNew = function(){
				var obj = {
						newrow:true
				};
				$scope.header.forEach(function(col){
					obj[col.id] = "";
				})
				$timeout(function(){
					$scope.data.push(obj);
				})
			}
			$scope.saveNew = function(index){
				delete $scope.data[$scope.data.length-1]['newrow'];
				delete $scope.data[index]['editable'];
				delete $scope.data[index]['newrow'];
			}
			$scope.deleteRow = function(index){
				$scope.data.splice(index,1);
			}
			$scope.editRow=function(index){
				$scope.data[index]['editable'] = true;
			}
        },
        link: function () {

        }
    }
});