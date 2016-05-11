<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="wrapper">
<header>
    <div class="navbar navbar-default navbar-static-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="../index.jsp"><span>F</span>unForFido</a> <!-- todo: make this a little different -->
            </div>
            <div class="navbar-collapse collapse ">
                <ul class="nav navbar-nav">
                    <li class="active">
                        <a href="index.jsp"><i class="fa fa-home"></i>Home</a>
                    </li>
                    <li class="active"><a href="aboutUs">About Us</a></li>

                    <c:if test="${pageContext.request.isUserInRole('member')}">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">Members<b class=" icon-angle-down"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="../AddPark">Edit Profile</a></li>
                            <li><a href="../searchPark.jsp">Search an area</a></li>
                            <li><a href="../AddPark">Add a park</a></li>
                            <li><a href="/logUserOut">Log out</a></li>
                        </ul>
                    </li>
                    </c:if>

                    <c:if test="${pageContext.request.userPrincipal == null}">
                    <li class="dropdown">
                    <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">Sign in  <b class=" icon-angle-down"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="/Login">Sign In</a></li>
                        <li><a href="/addNewMember">Not a member ? Sign up here</a></li>
                    </ul>
                    </li>
                    </c:if>


                    <c:if test="${pageContext.request.isUserInRole('admin')}">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">Admin<b class=" icon-angle-down"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="../admin/copyright.jsp">Copyright</a></li>
                            <li><a href="../admin/components.jsp">components</a></li>
                            <li><a href="../admin/pricingbox.jsp">pricing box</a></li>
                            <li><a href="../admin/blog.jsp">blog</a></li>
                            <li><a href="../admin/portfolio.jsp">portfolio</a></li>
                            <li><a href="../admin/admin.jsp">Admin</a></li>
                            <li><a href="/logUserOut">Log out</a></li>
                        </ul>
                    </li>
                    </c:if>

                    <li><a href="../contact.jsp">Contact us</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>
</div>
