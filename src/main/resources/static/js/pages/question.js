$(document).ready(function () {


    // 填充题目列表信息
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/admin/question/list",
        dataType: "json",
        success: function (json) {
            $.each(json, function (i, item) {
                $('#tbody-question').append(
                    '<tr><td>' + +item.questionid +
                    '</td><td>' + item.questioncontent +
                    '</td><td>' + item.questionanswer +
                    '</td><td>' + item.questionstar +
                    '</td><td>' + item.questiontype +
                    '<td><button class="btn btn-success" onclick="updateQuestion(' + item.questionid + ')"><i class="fa fa-edit"></i> 编辑</button> ' +
                    '<button class="btn btn-danger" onclick="deleteQuestion(' + item.questionid + ')"><i class="fa fa-trash-o"> 删除</i></button></td></tr>');
            });
            $('#dataTables-question').dataTable();

        }
    });

});

// 监听题目星级Select改变，改变注入相应的题目
document.getElementById("questionStar").onchange = function () {
    var star = $('#questionStar option:selected').attr("star").toString();
    //	alert(categoryId);
    if (star === "") {
        var url = "http://localhost:8080/admin/question/list";
    } else {
        var url = "http://localhost:8080/admin/question/list/sort/" + star;
    }
    $.ajax({
        url: url,
        type: "GET",
        dataType: "json",
        success: function (json) {
            // 先清空博文数据
            $('#tbody-question').html("");
            $.each(json, function (i, item) {
                $('#tbody-question').append(
                    '<tr><td>' + +item.questionid +
                    '</td><td>' + item.questioncontent +
                    '</td><td>' + item.questionanswer +
                    '</td><td>' + item.questionstar +
                    '</td><td>' + item.questiontype +
                    '<td><button class="btn btn-success" onclick="updateQuestion(' + item.questionid + ')"><i class="fa fa-edit"></i> 编辑</button> ' +
                    '<button class="btn btn-danger" onclick="deleteQuestion(' + item.questionid + ')"><i class="fa fa-trash-o"> 删除</i></button></td></tr>');
            });
            $('#dataTables-question').dataTable();

        }
    });
};

// 删除按钮点击
function deleteQuestion(id) {
    $('#confirmBtn').attr("questionid", id);
    $('#myModal').modal();
};

// 确认删除按钮点击
$('#confirmBtn').click(function () {
    var id = $(this).attr("questionid");
    $.ajax({
        type: "DELETE",
        url: "http://localhost:8080/admin/question/" + id,
        success: function () {
            // 刷新页面
            location.reload();
        }
    });
});

// 编辑题目按钮点击
function updateQuestion(id) {
    // 往模态框填充数据
    $('#updateBtn').attr("questionid", id);
    $.ajax({
        type: "get",
        url: "http://localhost:8080/admin/question/" + id,
        dataType: "json",
        async: false,
        success: function (json) {
            $('#updateContent').val(json.questioncontent);
            $('#updateAnswer').val(json.questionanswer);
            // 填充星级数据

            var select = document.getElementById("updateStar");
            for (var i = 0; i < select.options.length; i++) {
                if (select.options[i].text==json.questionstar) {
                    //					alert(i);
                    //					alert(select.options[i].innerHTML);
                    //					alert(json.categoryName);
                    select.options[i].selected = true;
                    break;
                }
            }
            $('#updateType').val(json.questiontype);
        }
    });

    // 显示模态框
    $('#updateModal').modal();
};

// 更新题目按钮点击事件
$('#updateBtn').click(function () {
    var questionid = $('#updateBtn').attr("questionid");
    var questioncontent = $('#updateContent').val();
    var questionanswer = $("#updateAnswer").val();
    var questionstar = $("#updateStar option:selected").attr("star").toString();
    var questiontype = $('#updateType').val();
    var question = {
        questionid: questionid,
        questioncontent: questioncontent,
        questionanswer: questionanswer,
        questionstar: questionstar,
        questiontype: questiontype,
    }
    $.ajax({
        type: "PUT",
        url: "http://localhost:8080/admin/question/" + questionid,
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        data: JSON.stringify(question),
        success: function () {
            location.reload();
        },
        error: function () {
            location.reload();
        }
    });
});

// 增加题目按钮点击事件
$('#addQuestionBtn').click(function () {
    var questioncontent = $('#addQuestionContent').val();
    var questionanswer = $("#addQuestionAnswer").val();
    var questionstar = $("#addQuestionStar option:selected").attr("star").toString();
    var questiontype = $('#addQuestionType').val();

    var question = {
        questioncontent: questioncontent,
        questionanswer: questionanswer,
        questionstar: questionstar,
        questiontype: questiontype,
    }
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/admin/question/add",
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        data: JSON.stringify(question),
        success: function () {
            location.reload();
        },
        error: function () {
            location.reload();
        }
    });
});