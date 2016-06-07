'use strict';
 
App.controller('UserController', ['$scope', 'UserService', function($scope, UserService) {
          var self = this;
          self.user={};
          self.users=[];
               
          self.fetchAllUsers = function(){
              UserService.fetchAllUsers()
                  .then(
                               function(d) {
                                    self.users = d;
                               },
                                function(errResponse){
                                    console.error('Error while fetching Currencies');
                                }
                       );
          };
          
          self
}]);