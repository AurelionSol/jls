package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.Comment;
import com.qpanda.jls.pojo.CommentExample;
import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer commentid);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer commentid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}