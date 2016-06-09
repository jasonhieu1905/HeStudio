'use strict';
 
var app = angular.module('hestudio',['ngRoute']);

app.controller('appCtrl', function ($rootScope,$location) {
	

});

app.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {
    //$locationProvider.html5Mode(true);
    $routeProvider
        .when('/home', {
            template: "<home></home>"
        })
        .when('/', {
            template: "<login></login>"
        })
        .otherwise({
            redirectTo: '/'
        });
}])
