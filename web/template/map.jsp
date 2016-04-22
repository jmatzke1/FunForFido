<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 3/22/16
  Time: 12:40 PM
  To change this template use File | Settings | File Templates.
--%>
<div onload="testConnection();" class="container">

    <div class="map">

        <!-- todo: fix setting for searching this map -->
        <!-- todo: get current location from browser otherwise map f -->

        <iframe src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Madison+Capital+Region&amp;aq=3&amp;oq=kuningan+&amp;sll=37.0625,-95.677068&amp;sspn=37.410045,86.572266&amp;ie=UTF8&amp;hq=&amp;hnear=Kuningan&amp;t=m&amp;z=14&amp;ll=-6.238824,106.830177&amp;output=embed">
        </iframe>

    </div>

    <label for="searchForMap"> Search for dog park: </label><input type="text" id="searchForMap">  by
    <label for="zipSearch"> Zip Code </label>
    <input type="radio" id="zipSearch" name="searchType" value="zip" />
    <label for="citySearch"> City </label>
    <input type="radio" id="citySearch" name="searchType" value="city" />
    <button type="button" id="searchButton" onclick="makeMapResults">Search</button>

</div>



