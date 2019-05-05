package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.Schedule;
import com.qpanda.jls.pojo.ScheduleExample;
import java.util.List;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Integer schedulid);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    List<Schedule> selectByExample(ScheduleExample example);

    Schedule selectByPrimaryKey(Integer schedulid);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);
}