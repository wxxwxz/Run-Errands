getReleaseListRequest()

function getReleaseListRequest() {
    post('report/getUsdReportList',[],function (result) {
        listHtml = ''
        for (var i = 0; i < result.length; i++){
            var idi = result[i].reportID
            listHtml += '<li class="list-group-item">'
            listHtml += '<button type="button" onclick="get_dispose('+idi+')">dispose</button>'
            listHtml += '<span class="badge">'+result[i].reporter+'</span>'
            listHtml += result[i].course
            listHtml += '</li>'
        }
        $('#repo_list').html(listHtml)
    })
}

function get_dispose(idi) {
    var dispose = prompt("dispose");
    var param1 = {'id':idi,'dispose':dispose}
    post('report/addSolve',param1,function (result) {
        if (result.code == '200'){
            alert(result.desc)
        }else {
            alert(result.desc)
        }
    })
    var param2 = {'id':idi}
    post('report/solveReport',param2,function (result) {
        getReleaseListRequest()
    })
}