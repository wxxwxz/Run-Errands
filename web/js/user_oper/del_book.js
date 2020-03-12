$("#add_btn").on('click',function () {
    var bookname = $('#bookname').val()
    var param = {'name':bookname,'author':author,'publisher':publisher,'number':number}
    post('book/addBook',param,function (result) {
        if (result.code == '200'){
            alert(result.desc)
            window.location.href = "user.jsp"
        }else {
            alert(result.desc)
            window.location.href = "add_release.jsp"
        }
    })
})