/*
    Get a variable passed on the get parameters
    @parameterName string -> Key-Value containing his key and the description
    @return -> value of the key
*/

function findGetParameter(parameterName) {
    var result = null,
        tmp = [];
    location.search
        .substr(1)
        .split("&")
        .forEach(function (item) {
          tmp = item.split("=");
          if (tmp[0] === parameterName) result = decodeURIComponent(tmp[1]);
        });
    return result;
}

// logic to get the value for the video and modify the source tag
$(document).ready(function() {
    var video_elem = $("#video"); 
    var video_source = $("#source");
    var src = findGetParameter("video");
    video_source.attr("src", src);
    console.log(video_source.attr("src"));
    video_elem[0].load();
});
    