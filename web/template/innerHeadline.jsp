<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 4/10/16
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>


<section id="inner-headline">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <ul class="breadcrumb">
                    <li><a href="index.jsp"><i class="fa fa-home"></i></a><i class="icon-angle-right"></i></li>
                    <li class="active">${pageTitle}</li>
                    <c:if test="${not empty pageContext.request.userPrincipal}">
                      <li>Welcome, <c:out value="${pageContext.request.userPrincipal.name}" /></li>
                    </c:if>
                    <c:if test="${empty pageContext.request.userPrincipal}">
                        <li>Welcome, Guest, Please sign in.</li>
                    </c:if>
                </ul>
            </div>
        </div>
    </div>
</section>
<!-- todo: add logout when logged in -->
