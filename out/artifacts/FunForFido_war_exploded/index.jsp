<!DOCTYPE html>
<html lang="en">

<jsp:include page="template/head.jsp" />

<body>

<div id="wrapper">

	<jsp:include page="template/header.jsp"/>
	<jsp:include page="template/map.jsp"/>
	// TODO: tem<!-- TODO: maybe make the map a link to go to search page -->
</div>
<div>
	<section id="featured">
		<!-- start slider -->
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<!-- Slider -->
					<div id="main-slider" class="flexslider">
						<ul class="slides">
							<li>
								<img src="img/slides/1.jpg" alt=""/>
								<div class="flex-caption">
									<h3>Find the nearest park</h3>
									<p>Just enter a city or zip code</p>
									<a href="#" class="btn btn-theme">Search here</a>
								</div>
							</li>
							<li>
								<img src="img/slides/2.jpg" alt=""/>
								<div class="flex-caption">
									<h3>All with different amenities</h3>
									<p>Sodales neque vitae justo sollicitudin aliquet sit amet diam curabitur sed
										fermentum.</p>
									<a href="#" class="btn btn-theme">Learn More</a>
								</div>
							</li>
							<li>
								<img src="img/slides/3.jpg" alt=""/>
								<div class="flex-caption">
									<h3>Clean & Fast</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit donec mer lacinia.</p>
									<a href="#" class="btn btn-theme">Learn More</a>
								</div>
							</li>
						</ul>
					</div>
					<!-- end slider -->
				</div>
			</div>
		</div>


	</section>


	<section class="callaction">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="big-cta">
						<div class="cta-text">
							<h2><span>Fun for Fido</span></h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- TODO: make this template for certain logged in members-->
	<section id="content">
		<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="row">
					<div class="col-lg-3">
						<div class="box">
							<div class="box-gray aligncenter">
								<h4>Add or update your profile</h4>
								<div class="icon">
									<!-- TODO: change this icon -->
									<i class="fa fa-desktop fa-3x"></i>
								</div>
								<p>
									Add information or pictures to your profile
								</p>

							</div>
							<div class="box-bottom">
								<a href="#">Click here</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="box">
							<div class="box-gray aligncenter">
								<h4>Modern Style</h4>
								<div class="icon">
									<!-- TODO: change this icon -->
									<i class="fa fa-pagelines fa-3x"></i>
								</div>
								<p>
									Voluptatem accusantium doloremque laudantium sprea totam rem aperiam.
								</p>

							</div>
							<div class="box-bottom">
								<a href="#">Learn more</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="box">
							<div class="box-gray aligncenter">
								<h4>Customizable</h4>
								<div class="icon">
									<!-- TODO: change this icon -->
									<i class="fa fa-edit fa-3x"></i>
								</div>
								<p>
									Voluptatem accusantium doloremque laudantium sprea totam rem aperiam.
								</p>

							</div>
							<div class="box-bottom">
								<a href="#">Learn more</a>
							</div>
						</div>
					</div>
					<div class="col-lg-3">
						<div class="box">
							<div class="box-gray aligncenter">
								<h4>Valid HTML5</h4>
								<div class="icon">
									<i class="fa fa-code fa-3x"></i>
								</div>
								<p>
									Voluptatem accusantium doloremque laudantium sprea totam rem aperiam.
								</p>

							</div>
							<div class="box-bottom">
								<a href="#">Learn more</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- divider -->
		<div class="row">
			<div class="col-lg-12">
				<div class="solidline">
				</div>
			</div>
		</div>
		<!-- end divider -->
		<!-- Portfolio Projects -->
		<jsp:include page="template/recentWorks.jsp"/>
	</section>
	<jsp:include page="template/footer.jsp"/>
</div>

<jsp:include page="template/jquery.jsp"/>
</body>
</html>