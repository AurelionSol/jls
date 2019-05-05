package com.qpanda.jls.Controller;


import com.qpanda.jls.Service.CommentService;
import com.qpanda.jls.Service.UserService;
import com.qpanda.jls.pojo.Comment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(value = "评论管理")
@RequestMapping(value = {"/admin/comment","/api/comment"})
@RestController
public class CommentController {
    @Autowired
    CommentService commentService;
    @Autowired
    UserService userService;

    @GetMapping("/list")
    @ApiOperation("获取评论列表")
    public List<Comment> getCommentList() {
        return  commentService.listAllComment();
    }

    @ApiOperation("新增评论")
    @PostMapping("/add")
    public void addComment(@RequestBody Map<String,String> requestbody) {
        String content = requestbody.get("content");
        int articleid=Integer.valueOf(requestbody.get("articleid"));
        int userid = userService.getUserByToken(requestbody.get("token")).getUserid();
        Comment comment = new Comment();

        comment.setCommentcontent(content);
        comment.setCommentarticleid(articleid);
        comment.setCommentauthorid(userid);
        commentService.addComment(comment);
    }

    @ApiOperation("查询评论")
    @GetMapping(value = "/{id}")
    public Comment getComment(@PathVariable Integer id) {
        return commentService.getCommentById(id);
    }

    @ApiOperation("更新评论信息")
    @PutMapping(value = "/{id}")
    public void updateComment(@PathVariable Integer id, @RequestBody Comment comment) {
        commentService.updateComment(comment);
    }

    @ApiOperation("删除评论")
    @DeleteMapping(value = "/{id}")
    public void deleteComment(@PathVariable Integer id) {
        commentService.deleteCommentById(id);
    }

    @ApiOperation("获取某篇文章评论列表")
    @GetMapping(value ="/list/sort/{articleId}")
    public List<Comment> getCommentListByArticleId(@PathVariable int articleId) {
        return  commentService.listCommentByArticleId(articleId);
    }

    @ApiOperation("获取某个作者的评论列表")
    @GetMapping(value ="/list/sort/author/{token}")
    public List<Comment> getCommentListByAuthor(@PathVariable String token) {

        return  commentService.listCommentByAuthorId(userService.getUserByToken(token).getUserid());
    }

}
