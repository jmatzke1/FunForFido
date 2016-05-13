<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<c:set var="pageTitle" value="Search near you" scope="request" />

<jsp:include page="template/head.jsp" />
<body onload="getLocation()">

<div id="wrapper">
	<jsp:include page="template/header.jsp" />
	<div class="container">

		<section id="content">

			<jsp:include page="template/innerHeadline.jsp" />

			<!-- divider -->
			<div class="row">
				<div class="col-lg-12">
					<div class="solidline">
					</div>
				</div>
			</div> <!-- solid line -->

			<jsp:include page="template/map.jsp" />


		<!-- divider -->
		<div class="row">
			<div class="col-lg-12">
				<div class="solidline">
				</div>
			</div>
		</div>
		<!-- end divider -->
		<div class="row">
			<div class="col-lg-12">
				<h4>Using this is easy just add you zip code and dog park in the search bar and find the nearest dop <parks></parks></h4>
				<pre class="prettyprint linenums">
					Any changes on how the search is done will be here. Since this is a hobby site where I
					will be using what I learn. It will be changing constantly. Thanks.
				</pre>
			</div>
		</div>
	</section>
	</div>
	<jsp:include page="template/footer.jsp" />

</div>
<a href="#" class="scrollup"><i class="fa fa-angle-up active"></i></a>

<jsp:include page="template/jquery.jsp" />
</body>

</html>