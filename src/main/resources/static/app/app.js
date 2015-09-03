//(function(angular) {
//  angular.module("myApp.controllers", []);
//  angular.module("myApp.services", []);
//  angular.module("myApp", ["ngResource", "myApp.controllers", "myApp.services"]);
//}(angular));

// MODULE
var eventsApp = angular.module('eventsApp', ['ngRoute', 'ngResource']);

// ROUTE
eventsApp.config(function($routeProvider) {
  $routeProvider
      .when('/register', {
        templateUrl: "pages/register-ptl.html",
        controller: "RegisterUserController"
      });
});

// CONTROLLERS
eventsApp.controller('AppController', ['$scope', function($scope) {
    $scope.viewBackground = "background-big"
}]);

eventsApp.controller('RegisterUserController', ['$scope', function($scope) {
    $scope.viewBackground = "background-small"
}]);

eventsApp.controller('EventsController', ['$scope', function($scope) {

}]);
