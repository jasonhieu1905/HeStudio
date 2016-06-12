<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="header-page">
    <img src="resources/images/bg2.jpg" id="bg">
	<div class="wrapper">
		<span class="logo">HÈ STUDIO</span>
		<span class="sub-logo">SG-HCM</span>
		<%--<div class="menu">--%>
		<%--<div class="menu-item"><a class="menu-link">HOME</a></div>--%>
		<%--<div class="menu-item"><a class="menu-link">SHOP</a></div>--%>
		<%--<div class="menu-item"><a class="menu-link">TREND</a></div>--%>
		<%--<div class="menu-item"><a class="menu-link">ABOUT US</a></div>--%>
		<%--<div class="menu-item"><a class="menu-link">CONTACT US</a></div>--%>
		<%--</div>--%>
		<ul id="sdt_menu" class="sdt_menu align-center">
            <li ng-repeat = "item in menu">
                <a href="#">
                    <img ng-src="{{item.src}}" alt="" />
                    <span class="sdt_active"></span>
                    <span class="sdt_wrap">
                        <span class="sdt_link">{{item.title}}</span>
                        <span class="sdt_descr">{{item.description}}</span>
                    </span>
                </a>
                <div class="sdt_box" ng-show="item.sub1 && item.sub1.length > 0">
                    <div class="sdt_box_running" >
                        <a ng-repeat="s1 in item.sub1" href="#">
                            {{s1.title}}
                        </a>
                    </div>
                </div>
                 <%--<div class="sdt_box_children">--%>
                       <%--<a ng-repeat="s2 in item.sub2" >--%>
                        <%--{{s2.title}}--%>
                        <%--</a>--%>
                 <%--</div>--%>
            </li>
		</ul>
	</div>
</div>