package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.SysView;
import com.qpanda.jls.pojo.SysViewExample;
import java.util.List;

public interface SysViewMapper {
    int deleteByPrimaryKey(Integer sysviewid);

    int insert(SysView record);

    int insertSelective(SysView record);

    List<SysView> selectByExample(SysViewExample example);

    SysView selectByPrimaryKey(Integer sysviewid);

    int updateByPrimaryKeySelective(SysView record);

    int updateByPrimaryKey(SysView record);
}