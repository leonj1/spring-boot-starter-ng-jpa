angular.module('message', []).controller('entertrade', function($scope, $http) {
    $http.get('/resource/').success(function(data) {
        $scope.greeting = data;
    });
});
