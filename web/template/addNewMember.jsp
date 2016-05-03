<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 3/29/16
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<!-- todo: add validation -->
<form id="addMemberToDatabase" role="form" data-toggle="validator" class="form-horizontal"
      action="/addMemberToDatabase"
      method="post">
    <fieldset>

    <div class="form-group"> <!-- first name -->
        <label for="FirstName" class="col-lg-2 control-label">First Name</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="FirstName" >
        </div>
    </div>

    <div class="form-group">
        <label for="LastName" class="col-lg-2 control-label">Last Name</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="LastName">
        </div>
    </div>

    <div class="form-group">
        <label for="emailAddress" class="col-lg-2 control-label">Email</label>
        <div class="col-lg-4">
            <input type="email" class="form-control" id="emailAddress">
        </div>
    </div>

    <div class="form-group">
        <label for="password" class="col-lg-2 control-label">Password</label>
        <div class="col-lg-4">
            <input type="password" class="form-control" id="password">
        </div>
    </div>

    <div class="form-group">
        <label for="password2" class="col-lg-2 control-label">Re-enter password</label>
        <div class="col-lg-4">
            <input type="password" class="form-control" id="password2">
        </div>
    </div>

    <div class="form-group">
        <label for="address" class="col-lg-2 control-label">Address</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="address">
        </div>
    </div>

    <div class="form-group">
        <label for="city" class="col-lg-2 control-label">City</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="city">
        </div>
    </div>

    <div class="form-group">
        <label for="state" class="col-lg-2 control-label">State</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="state">
        </div>
    </div>

    <div class="form-group">
        <label for="zipCode" class="col-lg-2 control-label">Zip Code</label>
        <div class="col-lg-4">
            <input type="text" class="form-control" id="zipCode">
        </div>
    </div>

    <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
            <button type="submit" class="btn btn-default">Sign up</button>
        </div>
    </div>

    </fieldset>

</form>