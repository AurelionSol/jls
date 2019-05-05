package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.SysLog;
import com.qpanda.jls.pojo.SysLogExample;
import java.util.List;

public interface SysLogMapper {
    int deleteByPrimaryKey(Integer syslogid);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    List<SysLog> selectByExample(SysLogExample example);

    SysLog selectByPrimaryKey(Integer syslogid);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}