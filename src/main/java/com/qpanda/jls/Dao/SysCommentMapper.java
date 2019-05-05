package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.SysComment;
import com.qpanda.jls.pojo.SysCommentExample;
import java.util.List;

public interface SysCommentMapper {
    int deleteByPrimaryKey(Integer syscommentid);

    int insert(SysComment record);

    int insertSelective(SysComment record);

    List<SysComment> selectByExample(SysCommentExample example);

    SysComment selectByPrimaryKey(Integer syscommentid);

    int updateByPrimaryKeySelective(SysComment record);

    int updateByPrimaryKey(SysComment record);
}