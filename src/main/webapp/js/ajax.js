/**
 * Created with IntelliJ IDEA.
 * User: IgorK
 * Date: 26.10.2013
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */

$(document).ready(function(){
    $('.button1').click(function() {
        var val = $(".input").val();
        $.ajax({
            type: "POST",
            url: "ajax",
            data: { id: val },
//            cache: false,
            dataType: "json",
            success: function (data) {
                $(".span").text(data.ok);
            },
            error: function () {
                alert('big error');
            }
        });
//        $.post("ajax", { id: val },
//            function(data){
//               $(".span").text(data);
//            }
//        );
    });
    $('.button2').click(function() {
        $('.ajax_html').load('ajaxHTML');
    });
});
