$(document).ready(function () {
    // 获得章节列表
    $.ajax({
        url: "http://localhost:8080/admin/chapter/list",
        type: "GET",
        dataType: "json",
        success: function (json) {
            $.each(json, function (i, item) {
                $('#tbody-chapter').append(
                    '<tr><td>' + +item.chapterid +
                    '</td><td>' + item.chaptername +
                    '</td><td>' + item.chaptertype +
                    '</td><td>' + item.chapterreadnum +
                    '</td><td>' + item.chapterimg +
                    '<td><button class="btn btn-success" onclick="updateChapter(' + item.chapterid + ')"><i class="fa fa-edit"></i> 编辑</button> ' +
                    '<button class="btn btn-danger" onclick="deleteChapter(' + item.chapterid + ')"><i class="fa fa-trash-o"> 删除</i></button></td></tr>');
                // $('#select-chapter').append(
                //     '<option chapterid="' + item.chapterid + '">' + item.chaptername + '</option>'
                // );
            });
            $('#dataTables-chapter').dataTable();
        }
    });
});


// 删除按钮点击事件
function deleteChapter(id) {
    $('#confirmBtn').attr("chapterid", id);
    $('#myModal').modal();
};

// 确认删除按钮点击事件
$('#confirmBtn').click(function () {
    var id = $(this).attr("chapterid");
    $.ajax({
        type: "DELETE",
        url: "http://localhost:8080/admin/chapter/" + id,
        success: function () {
            // 刷新页面
            location.reload();
        }
    });
});

// 增加章节按钮点击事件
$('#addChapterBtn').click(function () {
    var chaptername = $('#addChapterTitle').val();
    var chaptertype = $('#addChapterType').val();
    var chapterintroduction = $('#addChapterIntroduction').val();
    var chapterimg = $('#addChapterImg').val();
    var chaptercontent = $('#addChapterContent').val();
    var json = {
        chaptername: chaptername,
        chaptertype: chaptertype,
        chapterintroduction: chapterintroduction,
        chapterimg: chapterimg,
        chaptercontent: chaptercontent,
    };
    $.ajax({
        type: "POST",
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        url: "http://localhost:8080/admin/chapter/add",
        data: JSON.stringify(json),
        success: function () {
            // 刷新页面
            location.reload();
        },
        error: function () {
            location.reload();
        }
    });
});

// 更新章节点击事件
function updateChapter(id) {
    // 往模态框填充数据
    $('#updateBtn').attr("chapterid", id);
    $.ajax({
        type: "get",
        url: "http://localhost:8080/admin/chapter/" + id,
        dataType: "json",
        async: false,
        success: function (json) {
            $('#chapterName').val(json.chaptername);
            $('#chapterType').val(json.chaptertype);
            $('#chapterIntroduction').val(json.chapterintroduction);
            $('#chapterImg').val(json.chapterimg);
            $('#chapterContent').val(json.chaptercontent);
        }
    });

    // 显示模态框
    $('#updateModal').modal();
};

// 更新章节按钮点击事件
$('#updateBtn').click(function () {
    var chapterid = $('#updateBtn').attr("chapterid");
    var chaptername = $('#chapterName').val();
    var chaptertype = $('#chapterType').val();
    var chapterintroduction = $("#chapterIntroduction").val();
    var chapterimg = $("#chapterImg").val();
    var chaptercontent = $("#chapterContent").val();
    var chapter = {
        chapterid: chapterid,
        chaptername: chaptername,
        chaptertype: chaptertype,
        chapterintroduction: chapterintroduction,
        chapterimg: chapterimg,
        chaptercontent: chaptercontent,
    }
    $.ajax({
        type: "PUT",
        url: "http://localhost:8080/admin/chapter/" + id,
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        data: JSON.stringify(chapter),
        success: function () {
            location.reload();
        },
        error: function () {
            location.reload();
        }
    });
});