$(document).ready(function () {
    // // 填充博文分类信息
    // $.ajax({
    //     url: "http://10.2.3.235:80/api/category/list",
    //     type: "GET",
    //     dataType: "json",
    //     success: function (json) {
    //         $.each(json, function (i, item) {
    //             $('#articleCategories').append('<option categoryId="' + item.id + '">' + item.name + '</option>');
    //             $('#addCategories').append('<option categoryId="' + item.id + '">' + item.name + '</option>');
    //         });
    //     }
    // });

    // 填充博文列表信息
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/admin/article/list",
        dataType: "json",
        success: function (json) {
            $.each(json, function (i, item) {
                $('#tbody-article').append(
                    '<tr><td>' + +item.articleid +
                    '</td><td>' + item.articletitle +
                    '</td><td>' + item.articletype +
                    '</td><td>' + item.articleauthor +
                    '</td><td>' + item.articlereadnum +
                    '</td><td>' + item.articleimg +
                    '<td><button class="btn btn-success" onclick="updateArticle(' + item.articleid + ')"><i class="fa fa-edit"></i> 编辑</button> ' +
                    '<button class="btn btn-danger" onclick="deleteArticle(' + item.articleid + ')"><i class="fa fa-trash-o"> 删除</i></button></td></tr>');
            });
            $('#dataTables-article').dataTable();

        }
    });

});

// 监听博文分类Select改变，改变注入相应的博文
document.getElementById("articleType").onchange = function () {
    var type = $('#articleType option:selected').attr("type");
    //	alert(categoryId);
    if (type === "") {
        var url = "http://localhost:8080/admin/article/list";
    } else {
        var url = "http://localhost:8080/admin/article/list/sort/" + type;
    }
    $.ajax({
        url: url,
        type: "GET",
        dataType: "json",
        success: function (json) {
            // 先清空博文数据
            $('#tbody-article').html("");
            $.each(json, function (i, item) {
                $('#tbody-article').append(
                    '<tr><td>' + +item.articleid +
                    '</td><td>' + item.articletitle +
                    '</td><td>' + item.articletype +
                    '</td><td>' + item.articleauthor +
                    '</td><td>' + item.articlereadnum +
                    '</td><td>' + item.articleimg +
                    '<td><button class="btn btn-success" onclick="updateArticle(' + item.articleid + ')"><i class="fa fa-edit"></i> 编辑</button> ' +
                    '<button class="btn btn-danger" onclick="deleteArticle(' + item.articleid + ')"><i class="fa fa-trash-o"> 删除</i></button></td></tr>');
            });
            $('#dataTables-article').dataTable();

        }
    });
};

// 删除按钮点击
function deleteArticle(id) {
    $('#confirmBtn').attr("articalid", id);
    $('#myModal').modal();
};

// 确认删除按钮点击
$('#confirmBtn').click(function () {
    var id = $(this).attr("articalid");
    $.ajax({
        type: "DELETE",
        url: "http://localhost:8080/admin/article/" + id,
        success: function () {
            // 刷新页面
            location.reload();
        }
    });
});

// 编辑文章按钮点击
function updateArticle(id) {
    // 往模态框填充数据
    $('#updateBtn').attr("articleid", id);
    $.ajax({
        type: "get",
        url: "http://localhost:8080/admin/article/" + id,
        dataType: "json",
        async: false,
        success: function (json) {
            $('#articleTitle').val(json.articletitle);
            $('#articleIntroduction').val(json.articleintroduction);
            // 填充分类数据

            var select = document.getElementById("updateType");
            for (var i = 0; i < select.options.length; i++) {
                if (select.options[i].text==json.articletype) {
                    //					alert(i);
                    //					alert(select.options[i].innerHTML);
                    //					alert(json.categoryName);
                    select.options[i].selected = true;
                    break;
                }
            }
            $('#articleImg').val(json.articleimg);
            $('#articleContent').val(json.articlecontent);
        }
    });

    // 显示模态框
    $('#updateModal').modal();
};

// 更新文章按钮点击事件
$('#updateBtn').click(function () {
    var articleid = $('#updateBtn').attr("articleid");
    var articletitle = $('#articleTitle').val();
    var articleintroduction = $("#articleIntroduction").val();
    var articletype = $("#updateType option:selected").attr("type");
    var articleimg = $('#articleImg').val();
    var articlecontent = $('#articleContent').val();
    var article = {
        articleid: articleid,
        articletitle: articletitle,
        articleintroduction: articleintroduction,
        articletype: articletype,
        articleimg: articleimg,
        articlecontent: articlecontent,
    }
    $.ajax({
        type: "PUT",
        url: "http://localhost:8080/admin/article/" + articleid,
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        data: JSON.stringify(article),
        success: function () {
            location.reload();
        },
        error: function () {
            location.reload();
        }
    });
});

// 增加文章按钮点击事件
$('#addArticleBtn').click(function () {
    var articletitle = $('#addArticleTitle').val();
    var articleintroduction = $("#addArticleSummary").val();
    var articletype = $("#addArticleType option:selected").attr("type");
    var articleimg = $('#addArticleImg').val();
    var articlecontent = $('#addArticleContent').val();
    var article = {
        articletitle: articletitle,
        articleintroduction: articleintroduction,
        articletype: articletype,
        articleimg: articleimg,
        articlecontent: articlecontent,
    }
    $.ajax({
        type: "POST",
        url: "http://localhost:8080/admin/article/add",
        dataType: "json",
        contentType: "application/json;charset=utf-8",
        data: JSON.stringify(article),
        success: function () {
            location.reload();
        },
        error: function () {
            location.reload();
        }
    });
});