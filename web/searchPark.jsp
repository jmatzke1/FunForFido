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
				<h4>Preformatted text</h4>
				<pre class="prettyprint linenums">
					 &lt;div class="col-lg-12"&gt;<br />
					 &nbsp;&nbsp;&lt;p&gt;Lorem ipsum dolor sit amet, consetetur sadipscing elitr..&lt;/p&gt;<br />
					 &nbsp;&nbsp;&lt;p&gt;Lorem ipsum dolor sit amet, consetetur sadipscing elitr..&lt;/p&gt;<br />
					 &nbsp;&nbsp;&lt;p&gt;Lorem ipsum dolor sit amet, consetetur sadipscing elitr..&lt;/p&gt;<br />
					 &lt;/div&gt;
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