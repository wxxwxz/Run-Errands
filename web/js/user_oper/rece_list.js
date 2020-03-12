getReleaseListRequest()

function getReleaseListRequest() {
    var param = {'id':userId}
    post('deal/getMyDealList',param,function (result) {
        listHtml = ''
        for (var i = 0; i < result.length; i++){
            var idi = result[i].releaseID
            listHtml += '<li class="list-group-item">'
            //listHtml += '<button type="button" onclick="go_to_report()">report</button>'
            listHtml += '<span class="badge">'+result[i].releaseID+'</span>'
            listHtml += result[i].dealID
            listHtml += '</li>'
        }
        $('#rece_list').html(listHtml)
    })
}

function go_to_report() {
    alert("TODO")
}