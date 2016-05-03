/**
 * Created by jjjasonm on 4/21/16.
 */


$( document ).ready(function(){

getLocation();

});

function getLocation() {
    var x = document.getElementById("demo");

    console.log("getlocation ran")
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else {
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

function showPosition(position) {

    var x = document.getElementById("demo");

    var lat = position.coords.latitude;
    var lon = position.coords.longitude;

    x.innerHTML = "Latitude: " + lat +
        "<br>Longitude: " + lon;

    makeMapResults(lat, lon);
}


function testConnection() {

    console.log("test works");

}

function makeMapResults(lat, lon) {

    var loc = "https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Madison+dog+park+near+53704&amp;aq=3&amp;sll=" + lat + "," + lon + "&amp;ie=UTF8&amp;hq=&amp;t=m&amp;z=11&amp;ll=" + lat + "," + lon + "&amp;output=embed"

    //document.getElementById('iFrame').src = loc;
CON
    $("#iFrame").attr('src', loc);

       // request.getRemoteUser
}