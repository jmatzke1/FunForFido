<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 3/29/16
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>

<form id="updateMember" role="form" data-toggle="validator" class="form-horizontal"
      action="/updateMember"
      method="post">
    <fieldset>

        <div class="form-group"> <!-- first name -->
            <label for="FirstName" class="col-lg-2 control-label">First Name</label>
            <div class="col-lg-4">
                <input value="${member.firstName}" type="text" class="form-control" name="FirstName" id="FirstName" >
            </div>
        </div>

        <div class="form-group">
            <label for="LastName" class="col-lg-2 control-label">Last Name</label>
            <div class="col-lg-4">
                <input value=${member}  type="text" class="form-control" name="LastName" id="LastName">
            </div>
        </div>

        <div class="form-group">
            <label for="emailAddress" class="col-lg-2 control-label">Email</label>
            <div class="col-lg-4">
                <input value=${member}  type="email" class="form-control" id="emailAddress" name="emailAddress">
            </div>
        </div>

        <div class="form-group">
            <label for="username" class="col-lg-2 control-label">username</label>
            <div class="col-lg-4">
                <input value=${member}  type="text" class="form-control" name="username" id="username">
            </div>
        </div>

        <div class="form-group">
            <label for="password" class="col-lg-2 control-label">Password</label>
            <div class="col-lg-4">
                <input value=${member}  type="password" class="form-control" name="password" id="password">
            </div>
        </div>

        <div class="form-group">
            <label for="password2" class="col-lg-2 control-label">Re-enter password</label>
            <div class="col-lg-4">
                <input value=${member}  type="password" class="form-control" name="password2" id="password2">
            </div>
        </div>

        <div class="form-group">
            <label for="address" class="col-lg-2 control-label">Address</label>
            <div class="col-lg-4">
                <input value=${member}  type="text" class="form-control" name="address" id="address">
            </div>
        </div>

        <div class="form-group">
            <label for="city" class="col-lg-2 control-label">City</label>
            <div class="col-lg-4">
                <input value=${member}  type="text" class="form-control" name="city" id="city">
            </div>
        </div>

        <div class="form-group">
            <label for="state" class="col-lg-2 control-label">State</label>
            <div class="col-lg-4">
                <input value=${member}  type="text" class="form-control" name="state" id="state">
            </div>
        </div>

        <div class="form-group">
            <label for="zipCode" class="col-lg-2 control-label">Zip Code</label>
            <div class="col-lg-4">
                <input value=${member}  type="text" class="form-control" name="zipCode" id="zipCode">
            </div>
        </div>

        <div class="form-group">
            <div class="col-lg-offset-2 col-lg-10">
                <button type="submit" class="btn btn-default">Sign up</button>
            </div>
            <div class="col-lg-offset-2 col-lg-10">
                <button type="reset" class="btn btn-default">Clear</button>
            </div>
        </div>

    </fieldset>

</form>