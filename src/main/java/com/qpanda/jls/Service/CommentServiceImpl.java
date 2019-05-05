package com.qpanda.jls.Service;

import com.qpanda.jls.Dao.CommentMapper;
import com.qpanda.jls.pojo.Comment;
import com.qpanda.jls.pojo.CommentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements  CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public void addComment(Comment comment) {
        commentMapper.insertSelective(comment);
    }

    @Override
    public void deleteCommentById(Integer id) {
        commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateComment(Comment comment) {
        commentMapper.updateByPrimaryKeySelective(comment);
    }

    @Override
    public Comment getCommentById(Integer id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Comment> listAllComment() {
        CommentExample example = new CommentExample();
        return commentMapper.selectByExample(example);
    }

    @Override
    public int getCommentCountByArticleId(int articleId) {
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria=example.createCriteria();
        criteria.andCommentarticleidEqualTo(articleId);
        return commentMapper.selectByExample(example).size();
    }

    @Override
    public List<Comment> listCommentByArticleId(int articleId) {
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria=example.createCriteria();
        criteria.andCommentarticleidEqualTo(articleId);
        return commentMapper.selectByExample(example);
    }

    @Override
    public List<Comment> listCommentByAuthorId(int authorId) {
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andCommentauthoridEqualTo(authorId);
        return commentMapper.selectByExample(example);
    }
}
