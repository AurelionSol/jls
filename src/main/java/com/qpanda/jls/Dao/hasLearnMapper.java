package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.hasLearn;
import com.qpanda.jls.pojo.hasLearnExample;
import java.util.List;

public interface hasLearnMapper {
    int deleteByPrimaryKey(Integer haslearnid);

    int insert(hasLearn record);

    int insertSelective(hasLearn record);

    List<hasLearn> selectByExample(hasLearnExample example);

    hasLearn selectByPrimaryKey(Integer haslearnid);

    int updateByPrimaryKeySelective(hasLearn record);

    int updateByPrimaryKey(hasLearn record);
}