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
                    <li>Welcome, ${requestScope.getOrDefault(username, "Guest")}</li>
                </ul>
            </div>
        </div>
    </div>
</section>
