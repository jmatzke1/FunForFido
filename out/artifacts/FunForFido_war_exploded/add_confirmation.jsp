<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="pageTitle" value="Parked Added" scope="request" />

<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 3/20/16
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- todo: finish about content -->
<html>
<jsp:include page="template/head.jsp" />
<body
<jsp:include page="template/header.jsp" />
<jsp:include page="template/innerHeadline.jsp" />
<div class="container">
    ${object.parkName} was added to the database
<p>Go to home page or search for a park</p>
    <%--todo: add links--%>
</div>

<jsp:include page="template/footer.jsp" />
</body>

<jsp:include page="template/jquery.jsp"/>
</html>
