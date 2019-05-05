$(document).ready(function () {

    // 填充浏览统计数据
    $.ajax({
        url: "http://localhost:8080/admin/sys/view",
        type: "GET",
        dataType: "json",
        success: function (json) {
            $('#count-visits').append(json.length)

            $.each(json, function (i, item) {
                $('#tbody-visits').append(
                    '<tr><td>' + item.sysviewid +
                    '</td><td>' + item.sysviewip +
                    '</td><td>' + item.sysviewdate + '</td></tr>');
            });
            $('#dataTables-visits').dataTable();
        }
    });

    // 填充日志统计数据
    $.ajax({
        url: "http://localhost:8080/admin/sys/log",
        type: "GET",
        dataType: "json",
        success: function (json) {
            $('#count-logs').append(json.length)
            $.each(json, function (i, item) {
                $('#tbody-logs').append(
                    '<tr><td>' + item.syslogid +
                    '</td><td>' + item.syslogip +
                    '</td><td>' + item.syslogdate +
                    '</td><td>' + item.syslogby +
                    '</td><td>' + item.syslogurl + '</td></tr>');
            });
            $('#dataTables-logs').dataTable();
        }
    });

    // 填充留言统计数据
    $.ajax({
        url: "http://localhost:8080/admin/sys/comment",
        type: "GET",
        dataType: "json",
        success: function (json) {
            $('#count-comments').append(json.length)
            $.each(json, function (i, item) {
                $('#tbody-comments').append(
                    '<tr><td>' + item.syscommentid +
                    '</td><td>' + item.syscommentcontent +
                    '</td><td>' + item.syscommentdate +
                    '</td><td>' + item.syscommentname +
                    '</td><td>' + item.syscommentip +
                    '</td><td><button class="btn btn-danger deleteBtn" onclick="deleteComment(\'' + item.syscommentid + '\')"><i class="fa fa-trash-o"></i>删除</button></td></tr>');

            });
            $('#dataTables-comments').dataTable();
        }
    });

});

//删除评论
function deleteComment(id) {
    $('#confirmBtn').attr("syscommentid", id);
    $('#myModal').modal();
};

// 确认删除留言点击事件
$('#confirmBtn').click(function () {
    var id = $(this).attr("syscommentid");
    $.ajax({
        type: "DELETE",
        url: "http://localhost:8080/admin/sys/comment/" + id,
        success: function () {
            // 刷新页面
            location.reload();
        },
        error: function() {
            location.reload();
        }
    });
});