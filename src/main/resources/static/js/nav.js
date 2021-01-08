$(document).ready(
    function() {
        $(".nav-item").mouseover(
                function() {
                    alert("鼠标经过我了！！！");
                    $(this).css('background-color', 'lightgray')
                            .siblings()
                            .css('background-color', 'white');
                });

        $(".nav-item>li").mouseover(
                function() {
                    $(this).addClass("active").siblings().removeClass(
                            "active");
                    var index = $(this).index();
                    console.log(index);
                    $("#section>div").eq(index).show().siblings()
                            .hide();
                });
    });