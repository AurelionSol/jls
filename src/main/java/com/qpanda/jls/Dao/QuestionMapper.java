package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.Question;
import com.qpanda.jls.pojo.QuestionExample;
import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer questionid);

    int insert(Question record);

    int insertSelective(Question record);

    List<Question> selectByExample(QuestionExample example);

    Question selectByPrimaryKey(Integer questionid);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}