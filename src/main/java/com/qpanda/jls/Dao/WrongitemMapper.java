package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.Wrongitem;
import com.qpanda.jls.pojo.WrongitemExample;
import java.util.List;

public interface WrongitemMapper {
    int deleteByPrimaryKey(Integer wrongid);

    int insert(Wrongitem record);

    int insertSelective(Wrongitem record);

    List<Wrongitem> selectByExample(WrongitemExample example);

    Wrongitem selectByPrimaryKey(Integer wrongid);

    int updateByPrimaryKeySelective(Wrongitem record);

    int updateByPrimaryKey(Wrongitem record);
}