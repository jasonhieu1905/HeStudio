<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Search...">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div> <!-- /input-group -->
			</li>
			<li><a
				href="#/listAllCategories"><i
					class="fa fa-tasks"></i> Home</a></li>
			<li><a href="${pageContehxt.request.contextPath}/products"><i
					class="fa fa-gift"></i> Shop</a></li>

			<li><a href="#/admin/contact"><i
					class="fa fa-map-marker "></i> Trend</a></li>
			<li><a href="#/adminAllAccess"><i
					class="fa fa-users"></i> Stories</a>
			<li><a href="#/adminBanner"><i
					class="fa fa-picture-o"></i> Banner</a></li>
			<li><a href="#/adminMessage"><i
					class="fa fa-envelope-o"></i> Hộp thư khách hàng</a></li>
			<li><a ng-href="#/adminprofile"><i class="fa fa-user"></i>
					Manage User Profile</a></li>
		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>