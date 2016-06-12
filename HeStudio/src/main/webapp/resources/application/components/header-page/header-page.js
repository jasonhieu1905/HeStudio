app.directive('headerPage', function ($timeout) {
    return {
        restrict: 'AE',
        replace: true,
        templateUrl: 'resources/application/components/header-page/header-page.jsp',
        scope: {},
        controller: function ($scope, $element) {
            $scope.menu=[
                {
                    title:"Home",
                    description:"Home page",
                    src:"resources/images/1.jpg"
                },{
                    title:"Shop",
                    description:"Go shopping",
                    src:"resources/images/2.jpg",
                    sub1:[
                        {
                            title:"ABC"
                        }
                    ],
                    sub2:[
                          {
                        	  title:"ABC"
                          }
                    ]
                },{
                    title:"Trend",
                    description:"Furnishing styles",
                    src:"resources/images/3.jpg"
                },{
                    title:"About us",
                    description:"get to know us",
                    src:"resources/images/4.jpg"
                },{
                    title:"Contact us",
                    description:"Answer and question",
                    src:"resources/images/5.jpg"
                }

            ]
        },
        link: function ($scope, $element) {
            /*$timeout(function(){
                $(function() {
                    *//**
                     * for each menu element, on mouseenter,
                     * we enlarge the image, and show both sdt_active span and
                     * sdt_wrap span. If the element has a sub menu (sdt_box),
                     * then we slide it - if the element is the last one in the menu
                     * we slide it to the left, otherwise to the right
                     *//*
                    $('#sdt_menu > li').bind('mouseenter',function(){
                        var $elem = $(this);
                        $elem.find('img')
                            .stop(true)
                            .animate({
                                'width':'170px',
                                'height':'170px',
                                'left':'0px'
                            },400,'easeOutBack')
                            .andSelf()
                            .find('.sdt_wrap')
                            .stop(true)
                            .animate({'top':'140px'},500,'easeOutBack')
                            .andSelf()
                            .find('.sdt_active')
                            .stop(true)
                            .animate({'height':'170px'},300,function(){
                                var $sub_menu = $elem.find('.sdt_box');
                                if($sub_menu.length){
                                    var left = '170px';
                                    if($elem.parent().children().length == $elem.index()+1)
                                        left = '-170px';
                                    $sub_menu.show().animate({'left':left},200);
                                }
                            });
                    }).bind('mouseleave',function(){
                        var $elem = $(this);
                        var $sub_menu = $elem.find('.sdt_box');
                        if($sub_menu.length)
                            $sub_menu.hide().css('left','0px');

                        $elem.find('.sdt_active')
                            .stop(true)
                            .animate({'height':'0px'},300)
                            .andSelf().find('img')
                            .stop(true)
                            .animate({
                                'width':'0px',
                                'height':'0px',
                                'left':'85px'},400)
                            .andSelf()
                            .find('.sdt_wrap')
                            .stop(true)
                            .animate({'top':'25px'},500);
                    });
                });
            });*/

        }
    }
});