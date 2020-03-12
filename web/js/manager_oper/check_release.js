getReleaseListRequest()

function getReleaseListRequest() {
    post('release/getUcReleaseList',[],function (result) {
        listHtml = ''
        for (var i = 0; i < result.length; i++){
            var idi = result[i].releaseID
            listHtml += '<li class="list-group-item">'
            listHtml += '<button type="button" onclick="pass_check('+idi+')">pass</button>'
            listHtml += '<span class="badge">'+result[i].price+'</span>'
            listHtml += result[i].description
            listHtml += '</li>'
        }
        $('#check_list').html(listHtml)
    })
}

function pass_check(idi) {
    var param = {'id':idi}
    post('release/checkRelease',param,function (result) {
        getReleaseListRequest()
    })
}