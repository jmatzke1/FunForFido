<%--
  Created by IntelliJ IDEA.
  User: jjjasonm
  Date: 3/22/16
  Time: 12:40 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="container" onload="loadMap();">
    <a href="/SearchForPark">
        <div class="map">
            <!-- todo: copy from project -->
            <iframe id="mapFrame" scrolling="no" src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Madison+dog+park+near+53704&amp;aq=3&amp;sll=43.178516,-89.412994&amp;ie=UTF8&amp;hq=&amp;t=m&amp;z=11&amp;ll=43.178516,-89.412994&amp;output=embed">
            </iframe>


            <!-- oq=kuningan+&amp was after geocode -->
        </div>
    </a>
</div>
<%--<script>--%>

    <%--(function loadMap() {--%>

        <%--var lat;--%>
        <%--var lon;--%>
        <%--var loc;--%>

        <%--console.log("loading");--%>
        <%--if(navigator.geolocation) {--%>

            <%--navigator.geolocation.getCurrentPosition(function(position) {--%>
                <%--lat = position.coords.latitude;--%>
                <%--lon = position.coords.longitude;--%>
                <%--loc = "https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Madison+dog+park+near+53704&amp;aq=3&amp;sll=" + lat + "," + lon + "&amp;ie=UTF8&amp;hq=&amp;t=m&amp;z=11&amp;ll=" + lat + "," + lon + "&amp;output=embed"--%>
            <%--})--%>

        <%--} else {--%>
            <%--lat = 43.178516--%>
            <%--lon = -89.412994--%>

            <%--loc = "https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Madison+dog+park+near+53704&amp;aq=3&amp;sll=" + lat + "," + lon + "&amp;ie=UTF8&amp;hq=&amp;t=m&amp;z=11&amp;ll=" + lat + "," + lon + "&amp;output=embed"--%>
        <%--}--%>
        <%--//loc = "https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Madison+dog+park+near+53704&amp;aq=3&amp;sll=" + lat + "," + lon + "&amp;ie=UTF8&amp;hq=&amp;t=m&amp;z=11&amp;ll=" + lat + "," + lon + "&amp;output=embed"--%>
        <%--//document.getElementById('mapFrame').src = loc;--%>
        <%--console.log("hi" + loc);--%>
    <%--})--%>
<%--</script>--%>

