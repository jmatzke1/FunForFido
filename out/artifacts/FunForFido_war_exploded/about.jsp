<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="pageTitle" value="About Us" scope="request" />

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
<jsp:include page="template/aboutTemplate.jsp" />
</div>

<jsp:include page="template/footer.jsp" />
</body>

<jsp:include page="template/jquery.jsp"/>
</html>
