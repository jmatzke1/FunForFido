<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 3/29/16
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<h1>Add new park </h1>


<form id="addParkToDatabase" role="form" data-toggle="validator" class="form-horizontal"
      action="/addParkToDatabase"
      method="post">
    <fieldset>

        <div class="form-group">
            <label for="parkName" class="col-lg-2 control-label">Park Name</label>
            <div class="col-lg-4">
                <input type="text" class="form-control" id="parkName" >
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