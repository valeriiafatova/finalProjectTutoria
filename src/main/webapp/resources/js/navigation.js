function getContextPath() {
   return "${pageContext.request.contextPath}";
}
$(function (){
    $('#lang').find('a').click(function(e){
            e.preventDefault();
            var href = $(this).attr('href')
            $.post(getContextPath() + "/locale", {locale:href}, function(){
            location.reload();
            });
    });
})