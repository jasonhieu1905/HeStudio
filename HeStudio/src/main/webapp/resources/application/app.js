'use strict';
 
var app = angular.module('hestudio',['ngRoute']);

app.controller('appCtrl', function ($rootScope,$location,loginService) {
	
});

app.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {
    $routeProvider
        .when('/home', {
            template: "<home></home>"
        })
        .when('/login', {
            template: "<login></login>"
        })
        .when('/', {
            template: "<home></home>"
        })
        .otherwise({
            redirectTo: '/'
        });
    //$locationProvider.html5Mode(true);
    
}]);
