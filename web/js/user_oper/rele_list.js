getReleaseListRequest()

function getReleaseListRequest() {
    var param = {'id':userId}
    post('release/getMyReleaseList',param,function (result) {
        listHtml = ''
        for (var i = 0; i < result.length; i++){
            //var idi = result[i].releaseID
            listHtml += '<li class="list-group-item">'
            //listHtml += '<button type="button" onclick="pass_check('+idi+')">pass</button>'
            listHtml += '<span class="badge">'+result[i].releaseID+'</span>'
            listHtml += result[i].description
            listHtml += '</li>'
        }
        $('#relea_list').html(listHtml)
    })
}