function checkHeader() {
    $.ajax({
        method: "GET",
        url: "/Headers/HeaderServlet",
        headers: {
            'operation': 'SOMA',
            'fruit': 'APPLE'
        },
        success: function( data, textStatus, response){
            //do success stuff
            var status = response.getResponseHeader('status');
            $('#servletResponse').html('<br><br>Reponse header status is: '+ status + '<br>');
        },
        error: function(){
        //do error handling stuff
        $('#servletResponse').html('Servidor retornou erro.');
        }
    })
}
