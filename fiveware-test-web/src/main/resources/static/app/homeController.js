app.controller('homeController', function($scope, $http) {
		
	$scope.save = function(person) {
		$http.post('/api/person/save', person);
	}
	
	$scope.find = function(id) {
		$http.get('/api/person/find/' + id).then(function(r) {
			$scope.person = r.data;
		});
	}
});