/**
 * Created by Oleg on 16.01.2017.
 */


function RestGet () {
    var number=$('#number').val();
    $.ajax({
        type: 'GET',
        url:'/untitled19_war_exploded/myservice',
        dataType: 'json',
        contentType: 'application/json',
        
        async: true,
        success: function(result) {
            alert(result.name);

        },
        error: function(jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
    });
}