$(document).ready(function() {
	// 获得用户列表
	$.ajax({
		url: "http://localhost:8080/admin/user/list",
		type: "GET",
		dataType: "json",
		success: function(json) {
			$.each(json, function(i, item) {
				$('#tbody-user').append(
					'<tr><td>' + +item.userid +
					'</td><td>' + item.username +
					'</td><td>' + item.nickname +
					'</td><td>' + item.password +
					'<td><button class="btn btn-success" onclick="updateUser(' + item.userid + ')"><i class="fa fa-edit"></i> 编辑</button> ' +
					'<button class="btn btn-danger" onclick="deleteUser(' + item.userid + ')"><i class="fa fa-trash-o"> 删除</i></button></td></tr>');
				$('#select-user').append(
					'<option userid="' + item.userid + '">' + item.username + '</option>'
				);
			});
			$('#dataTables-user').dataTable();
		}
	});
});



// 删除按钮点击事件
function deleteUser(id) {
	$('#confirmBtn').attr("userid", id);
	$('#myModal').modal();
};

// 确认删除按钮点击事件
$('#confirmBtn').click(function() {
	var id = $(this).attr("userid");
	$.ajax({
		type: "DELETE",
		url: "http://localhost:8080/admin/user/" + id,
		success: function() {
			// 刷新页面
			location.reload();
		}
	});
});

// 增加用户按钮点击事件
$('#addUserBtn').click(function() {
	var username = $('#addUserName').val();
	var nickname = $('#addNickName').val();
	var password = $('#addPassword').val();
	var json = {
		username: username,
		nickname: nickname,
		password: password,
	};
	$.ajax({
		type: "POST",
		dataType: "json",
		contentType: "application/json;charset=utf-8",
		url: "http://localhost:8080/admin/user/add",
		data: JSON.stringify(json),
		success: function() {
			// 刷新页面
			location.reload();
		},
		error: function() {
			location.reload();
		}
	});
});

// 更新用户点击事件
function updateUser(id) {
	// 往模态框填充数据
	$('#updateBtn').attr("userid", id);
	$.ajax({
		type: "get",
		url: "http://localhost:8080/admin/user/" + id,
		dataType: "json",
		async: false,
		success: function (json) {
			$('#username').val(json.username);
			$('#nickname').val(json.nickname);
			$('#password').val(json.password);
		}
	});

	// 显示模态框
	$('#updateModal').modal();
};

// 更新用户按钮点击事件
$('#updateBtn').click(function () {
	var id = $('#updateBtn').attr("userid");
	var username = $('#username').val();
	var nickname = $("#nickname").val();
	var password = $("#password").val();

	var user = {
		userid: id,
		username: username,
		nickname: nickname,
		password: password,
	}
	$.ajax({
		type: "PUT",
		url: "http://localhost:8080/admin/user/" + id,
		dataType: "json",
		contentType: "application/json;charset=utf-8",
		data: JSON.stringify(user),
		success: function () {
			location.reload();
		},
		error: function () {
			location.reload();
		}
	});
});