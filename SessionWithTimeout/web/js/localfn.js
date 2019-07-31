function calcOffset() {
    var serverTime = $.cookie('serverTime');
    serverTime = serverTime==null ? null : Math.abs(serverTime);
    var clientTimeOffset = (new Date()).getTime() - serverTime;
    $.cookie('clientTimeOffset', clientTimeOffset);
    checkSession();
}

function checkSession() {
    var sessionExpiry = Math.abs($.cookie('sessionExpiry'));
    // var timeOffset = Math.abs($.cookie('clientTimeOffset'));
    var localTime = (new Date()).getTime();
    if (localTime > sessionExpiry) {
        $(location).attr('href', 'http://localhost:8084/SessionWithTimeout/LogoutServlet');
    } else {
        var tempLocalTime = localTime.valueOf();
        var tempSessionExpiry = sessionExpiry.valueOf();
        var secoundsToExpiry  = (parseInt((tempSessionExpiry - tempLocalTime)/1000));

        $('#sessionTimer').html('This session is valid for: '+secoundsToExpiry+ ' secounds');
        setTimeout(function() { checkSession(); }, 1000);
    }
}


//$('#sessionTimer').html(
//'localTime: '+localTime+'<br>'+
//    'timeOffset:'+timeOffset+'<br>'+
//    'timeOffset / 1000:'+(parseInt(timeOffset/1000))+'<br>'+
//    '(sessionExpiry+1000)'+sessionExpiry+'<br>'+
//    'diff:' +((parseInt((tempSessionExpiry - tempLocalTime)/1000))));
//setTimeout(function() { checkSession(); }, 1000);
