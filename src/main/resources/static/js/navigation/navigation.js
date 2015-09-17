angular.module('navigation', ['ngRoute', 'ngResource', 'auth'])
	.controller('navigation', function($scope, $resource, $route, $http, $rootScope, $location, auth) {

			$scope.credentials = {};

			$scope.tab = function(route) {
				return $route.current && route === $route.current.controller;
			};

			$scope.authenticated = function() {
				return auth.authenticated;
			};

			$scope.login = function() {
				auth.authenticate($scope.credentials, function(authenticated) {
					if (authenticated) {
						console.log("Login succeeded");
						$scope.error = false;
					} else {
						console.log("Login failed");
						$scope.error = true;
					}
				})
			};

			$scope.logout = function() {
				$http.post('logout', {}).success(function() {
					$rootScope.authenticated = false;
					auth.authenticated = false;
					$location.path("/");
				}).error(function(data) {
					$rootScope.authenticated = false;
				});
			};
		});
