$("#add_btn").on('click',function () {
    var description = $('#description').val()
    var price = $('#price').val()
    var param = {'userID':userId,'description':description,'price':price}
    post('release/addRelease',param,function (result) {
        if (result.code == '200'){
            alert(result.desc)
            window.location.href = "user.jsp"
        }else {
            alert(result.desc)
            window.location.href = "add_release.jsp"
        }
    })
})