<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 3/22/16
  Time: 12:40 PM
  To change this template use File | Settings | File Templates.
--%>
<div onload="testConnection();" class="container">
    <div id="demo"></div>
    <div class="map">

        <!-- todo: fix setting for searching this map -->
        <!-- todo: get current location from browser otherwise map f -->

       <iframe id="iframe">
        </iframe>
    <!--    <iframe src="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-43.178516,-89.412994&radius=500&&name=dog+park&key=AIzaSyA1rJTG5-NHUwA65pL-YLB4ISKj_13WpYU">
        </iframe> -->
    </div>

    <label for="searchForMap"> Search for dog park: </label><input type="text" id="searchForMap">  by
    <label for="zipSearch"> Zip Code </label>
    <input type="radio" id="zipSearch" name="searchType" value="zip" />
    <label for="citySearch"> City </label>
    <input type="radio" id="citySearch" name="searchType" value="city" />
    <button type="button" id="searchButton">Search</button>

</div>



