<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Admin Page</title>
<!-- Bootstrap Styles-->
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="<c:url value="/resources/css/font-awesome.css"/>"
	rel="stylesheet" />
<!-- Custom Styles-->
<!-- Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />

<script>
	var contextPath = "${pageContext.request.contextPath}"
</script>

</head>
<body>
	<script src="<c:url value="/resources/js/common/jquery-1.10.2.js" />"></script>
	<script src="<c:url value="/resources/js/common/bootstrap.min.js" />"></script>
	<script src="<c:url value='/resources/js/common/angular.js' />"></script>
	
	<div id="wrapper">
		<!-- Header -->
		<div>
			<tiles:insertAttribute name="body" />
		</div>
	</div>

</body>
</html>