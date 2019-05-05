package com.qpanda.jls.Dao;

import com.qpanda.jls.pojo.Plan;
import com.qpanda.jls.pojo.PlanExample;
import java.util.List;

public interface PlanMapper {
    int deleteByPrimaryKey(Integer planid);

    int insert(Plan record);

    int insertSelective(Plan record);

    List<Plan> selectByExample(PlanExample example);

    Plan selectByPrimaryKey(Integer planid);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKey(Plan record);
}