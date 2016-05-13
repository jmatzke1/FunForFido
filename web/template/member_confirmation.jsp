<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 5/10/16
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container text center-block">
    <div class="col-lg-6">
        <%--todo: fix centering--%>
        <h4> Username: ${user.username} was added to the database</h4>
        <dl class="dl-horizontal">
            <dt>Name:</dt>
            <dd>${member.firstName} ${member.lastName}</dd>
            <dt>Address:</dt>
            <dd>${member.address}</dd>
            <dt>City</dt>
            <dd>${member.city}</dd>
            <dt>State</dt>
            <dd>${member.state}</dd>
            <dt>Zip Code</dt>
            <dd>${member.zipCode}</dd>
            <dt>Click for </dt>
            <dd><a href="Login">to log in</a></dd>
        </dl>
    </div>
</div>