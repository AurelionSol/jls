package com.qpanda.jls.Service;

import com.qpanda.jls.pojo.Comment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CommentService {

    void addComment(Comment comment);

    void deleteCommentById(Integer id);

    void updateComment(Comment comment);

    Comment getCommentById(Integer id);

    List<Comment> listAllComment();

    int getCommentCountByArticleId(int articleId);

    List<Comment> listCommentByArticleId(int articleId);

    List<Comment> listCommentByAuthorId(int authorId);

}
