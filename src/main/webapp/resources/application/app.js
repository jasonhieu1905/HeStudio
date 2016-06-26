'use strict';
 
var app = angular.module('hestudio',['ngRoute','ngCookies','textAngular']);

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
        .when('/adminhome', {
            template: "<adminhome></adminhome>"
        })
        .when('/', {
            template: "<login></login>"
        })
        .when('/adminprofile', {
            template: "<admin-profile></admin-profile>"
        })
        .when('/adminbanner', {
            template: "<admin-banner></admin-banner>"
        })
        .when('/admincontact', {
            template: "<admin-contact></admin-contact>"
        })
        .otherwise({
            redirectTo: '/'
        });
    //$locationProvider.html5Mode(true);
    
}]);
