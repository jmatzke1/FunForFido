<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ %>
<!DOCTYPE html>
<html lang="en">
	<jsp:include page="template/head.jsp" />
<body>
<div id="wrapper">
	<jsp:include page="template/header.jsp"/> <!-- TODO: maybe make the map a link to go to search page -->
</div>
<section id="inner-headline">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<ul class="breadcrumb">
					<li><a href="index.jsp"><i class="fa fa-home"></i></a><i class="icon-angle-right"></i></li>
					<li class="active">${request.ID}</li>
					<li>Welcome, ${requestScope.getOrDefault(username, "Guest")}</li>
				</ul>
			</div>
		</div>
	</div>
</section>

<div>
	<section id="featured">

		<div class="container">
			<jsp:include page="template/flexslider.jsp" />
		</div>
		<a href="/SearchForPark"><div class="row">
			<div class="col-lg-12">
				<div class="big-cta">
					<div class="cta-text">
						<h2><span>Fun for Fido</span></h2>
						<h4><span>Click here to search near you</span></h4>
						<br />
					</div>
				</div>
			</div>
		</div>
		<!-- todo: says not to use absolute path in jsp's? -->
		<jsp:include page="template/indexMap.jsp"/>
		</a>

	</section> <!-- end of section featured -->
</div>


	<section class="callaction">
		<div class="container">

		</div>
	</section>

	<!-- TODO: make this template for certain logged in members-->
	<section id="content">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="solidline">
					</div>
				</div>
			</div>


		<jsp:include page="template/recentWorks.jsp"/>
			</div>
	</section>
	<jsp:include page="template/footer.jsp"/>

<jsp:include page="template/jquery.jsp"/>
</body>

</html>