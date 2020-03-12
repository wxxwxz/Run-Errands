getReleaseListRequest()

function getReleaseListRequest() {
    var param = {'id':userId}
    post('report/getMyReportList',param,function (result) {
        listHtml = ''
        for (var i = 0; i < result.length; i++){
            var disp = result[i].dispose
            if(result[i].isSolved ==1) var flag = "solved"
            else var flag = "unsolved"
            listHtml += '<li class="list-group-item">'
            listHtml += '<button type="button" onclick="check_solve('+disp+')">dispose</button>'
            listHtml += '<span class="badge">'+flag+'</span>'
            listHtml += result[i].course
            listHtml += '</li>'
        }
        $('#repo_list').html(listHtml)
    })
}

function check_solve(disp) {
    if(disp!=null) alert(disp)
    else alert("unsolved")
}


function add_repo() {
    window.location.href = "add_report.jsp"
}