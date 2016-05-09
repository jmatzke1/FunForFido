<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="pageTitle" value="Home" scope="request" />
<!-- Connor webservice to check for valid email-->

<!DOCTYPE html>
<html lang="en">
	<jsp:include page="template/head.jsp" />
	<body>
		<jsp:include page="template/header.jsp"/>

	<div class="container">
		<jsp:include page="template/innerHeadline.jsp" />
	</div>

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

		<jsp:include page="template/indexMap.jsp"/>
		</a>

	</section> <!-- end of section featured -->
</div>


	<section class="callaction"> <!-- todo: any use ? -->
		<div class="container">

		</div>
	</section>

	<c:if test="${pageContext.request.isUserInRole('admin')}">
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
	</c:if>
		<div class="container">
	<jsp:include page="template/footer.jsp"/>
		</div>

<jsp:include page="template/jquery.jsp"/>
</body>

</html>