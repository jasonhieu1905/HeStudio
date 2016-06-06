'use strict';
 
App.factory('UserService', ['$http', '$q', function($http, $q){
 
    return {
         
            fetchAllUsers: function() {
                    return $http.get('<%=request.getContextPath()%>/user/')
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while fetching users');
                                        return $q.reject(errResponse);
                                    }
                            );
            },
             
            createUser: function(user){
                    return $http.post('<%=request.getContextPath()%>/user/', user)
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while creating user');
                                        return $q.reject(errResponse);
                                    }
                            );
            },
             
            updateUser: function(user, id){
                    return $http.put('<%=request.getContextPath()%>/user/'+id, user)
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while updating user');
                                        return $q.reject(errResponse);
                                    }
                            );
            },
             
            deleteUser: function(id){
                    return $http.delete('<%=request.getContextPath()%>/user/'+id)
                            .then(
                                    function(response){
                                        return response.data;
                                    }, 
                                    function(errResponse){
                                        console.error('Error while deleting user');
                                        return $q.reject(errResponse);
                                    }
                            );
            }
         
    };
 
}]);