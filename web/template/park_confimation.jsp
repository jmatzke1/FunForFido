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
            <h4> ${object.parkName} was added to the database</h4>
            <dl class="dl-horizontal">
                <dt>Address:</dt>
                <dd>${object.address}</dd>
                <dt>City</dt>
                <dd>${object.city}</dd>
                <dt>State</dt>
                <dd>${object.state}</dd>
                <dt>Zip Code</dt>
                <dd>${object.zip}.</dd>
                <dt>Click for </dt>
                <dd><a href="/">home page</a>  or <a href="SearchForPark"> search for a park</a></dd>
            </dl>
        </div>
</div>