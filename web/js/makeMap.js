/**
 * Created by jjjasonm on 4/21/16.
 */

function getLocation() {
    var x = document.getElementById("demo");

    console.log("getlocation ran")
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else {
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

var map;
function initialize(lat,lon) {
    console.log("ll" + lat, lon);

    var mapOptions = {
        zoom: 11,
        center: new google.maps.LatLng(lat, lon),
        mapTypeId: google.maps.MapTypeId.ROADMAP,
        zoomControlOptions: {
            style: google.maps.ZoomControlStyle.MEDIUM,
            position: google.maps.ControlPosition.TOP_RIGHT
        }
    };
    map = new google.maps.Map(document.getElementById('map'),
        mapOptions);

    //var marker = new google.maps.Marker({
    //    position: {
    //        lat: lat,
    //        lng: lon
    //    },
    //    map: map,
    //    draggable: true
   // });

    // Create the search box and link it to the UI element.
    var input = document.getElementById('pac-input');
    var searchBox = new google.maps.places.SearchBox(input);
    map.controls[google.maps.ControlPosition.TOP_CENTER].push(input);

    // Bias the SearchBox results towards current map's viewport.
    map.addListener('bounds_changed', function () {
        searchBox.setBounds(map.getBounds());
    });

    var markers = [];
    // Listen for the event fired when the user selects a prediction and retrieve
    // more details for that place.
    searchBox.addListener('places_changed', function() {
        var places = searchBox.getPlaces();
        console.log(places);
        if (places.length == 0) {
            return;
        }

        // Clear out the old markers.
        markers.forEach(function(marker) {
            marker.setMap(null);
        });
        markers = [];

        // For each place, get the icon, name and location.
        var bounds = new google.maps.LatLngBounds();
        places.forEach(function(place) {
            var icon = {
                url: place.icon,
                size: new google.maps.Size(71, 71),
                origin: new google.maps.Point(0, 0),
                anchor: new google.maps.Point(17, 34),
                scaledSize: new google.maps.Size(25, 25)
            };
            // Create a marker for each place.
            markers.push(new google.maps.Marker({
                map: map,
                title: place.name,
                animation: google.maps.Animation.DROP,
                position: place.geometry.location

            }));
            console.log(place);

            if (place.geometry.viewport) {
                // Only geocodes have viewport.
                bounds.union(place.geometry.viewport);
            } else {
                bounds.extend(place.geometry.location);
            }
        });
        map.fitBounds(bounds);
    });

    var infowindow = new google.maps.InfoWindow();
    var service = new google.maps.places.PlacesService(map);

    service.getDetails({
        placeId: 'ChIJN1t_tDeuEmsRUsoyG83frY4'
    }, function(place, status) {
        if (status === google.maps.places.PlacesServiceStatus.OK) {
            var marker = new google.maps.Marker({
                map: map,
                position: place.geometry.location
            });
            google.maps.event.addListener(marker, 'click', function() {
                infowindow.setContent('<div><strong>' + place.name + '</strong><br>' +
                    'Place ID: ' + place.place_id + '<br>' +
                    place.formatted_address + '</div>');
                infowindow.open(map, this);
            });
        }
    });
}

    google.maps.event.addDomListener(window, 'load', initialize);
//google.maps.event.addDomListener(window, 'load', getLocation);

function showPosition(position) {

    var lat = position.coords.latitude;
    var lon = position.coords.longitude;

    initialize(lat,lon);

}

function makeMapResults(lat, lon) {

    var loc = "https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Madison+dog+park+near+53704&amp;aq=3&amp;sll=" + lat + "," + lon + "&amp;ie=UTF8&amp;hq=&amp;t=m&amp;z=11&amp;ll=" + lat + "," + lon + "&amp;output=embed"

}
