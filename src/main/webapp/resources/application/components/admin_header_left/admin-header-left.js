app.directive('adminHeaderLeft', function (loginService,$location,$cookieStore) {
    return {
        restrict: 'AE',
        replace: true,
        templateUrl: 'resources/application/components/admin_header_left/header_left.jsp',
        scope: {},
        controller: function ($scope, $element) {
        },
        link: function () {

        }
    }
});