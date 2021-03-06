<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 3/29/16
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<h1>Add new park </h1>

<!-- todo: add validation -->
<form id="addParkToDatabaseForm" role="form" data-toggle="validator" class="form-horizontal"
      action="/addParkToDatabase"
      method="post">
    <fieldset>
        <%--todo: addnewpark better form validation--%>
        <div class="form-group">
            <label for="parkName" class="col-lg-2 control-label">Park Name</label>
            <div class="col-lg-4">
                <input type="text" min="3" class="form-control" name="parkName" id="parkName" >
            </div>
        </div>

        <div class="form-group">
            <label for="address" class="col-lg-2 control-label">Address</label>
            <div class="col-lg-4">
                <input type="text" min="2" class="form-control" name="address" id="address">
               </div>
        </div>

        <div class="form-group">
            <label for="city" class="col-lg-2 control-label">City</label>
            <div class="col-lg-4">
                <input min="2" type="text" class="form-control" name="city" id="city">
            </div>
        </div>

        <div class="form-group">
            <label for="state" class="col-lg-2 control-label">State</label>
            <div class="col-lg-4">
                <input min="2" type="text" class="form-control" name="state" id="state">
            </div>
        </div>

        <div class="form-group">
            <label for="zipCode" class="col-lg-2 control-label">Zip Code</label>
            <div class="col-lg-4">
                <input required min="5" max="9" type="text" class="form-control" name="zipCode" id="zipCode">
            </div>
        </div>

        <div class="form-group">
            <div class="col-lg-offset-2 col-lg-10">
                <button type="submit" class="btn btn-default">Add Park</button>
            </div>
        </div>

    </fieldset>

</form>