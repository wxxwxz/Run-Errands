getReleaseListRequest()

function getReleaseListRequest() {
    post('release/getReleaseList',[],function (result) {
        listHtml = ''
        for (var i = 0; i < result.length; i++){
            var idi = result[i].releaseID
            listHtml += '<li class="list-group-item">'
            listHtml += '<button type="button" onclick="receive_errand('+idi+')">receive</button>'
            listHtml += '<span class="badge">'+result[i].price+'</span>'
            listHtml += result[i].description
            listHtml += '</li>'
        }
        $('#rel_list').html(listHtml)
    })
}

function receive_errand(idi) {
    var param1 = {'id':idi}
    post('release/beReceived',param1,function (result) {
        getReleaseListRequest()
    })

    var param2 = {'releaseID':idi,'receiver':userId}
    post('deal/addDeal',param2,function (result) {})
}