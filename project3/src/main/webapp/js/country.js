$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/Project3/country/2"
    }).then(function(data) {
       $('.country-id').append(data.id);
       $('.country-content').append(data.countryName);
    });
});