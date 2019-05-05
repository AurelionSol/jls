package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.Administrator;
import com.qpanda.jls.pojo.AdministratorExample;
import java.util.List;

public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorid);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    List<Administrator> selectByExample(AdministratorExample example);

    Administrator selectByPrimaryKey(Integer administratorid);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}