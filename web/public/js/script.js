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

$( document ).ready(function() {
    var video_elem = $("#video"); 
    var video_source = $("#source");
    var src = findGetParameter("video");
    video_source.attr("src", src);
    console.log(video_source.attr("src"));
    video_elem[0].load();
    // video_elem.play();
});
    