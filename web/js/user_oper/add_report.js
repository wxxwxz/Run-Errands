$("#add_btn").on('click',function () {
    var course = $('#course').val()
    var param = {'reporter':userId,'course':course}
    post('report/addReport',param,function (result) {
        if (result.code == '200'){
            alert(result.desc)
            window.location.href = "repo_list.jsp"
        }else {
            alert(result.desc)
            window.location.href = "add_report.jsp"
        }
    })
})