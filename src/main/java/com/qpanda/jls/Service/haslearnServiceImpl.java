package com.qpanda.jls.Service;

import com.qpanda.jls.Dao.hasLearnMapper;
import com.qpanda.jls.pojo.hasLearn;
import com.qpanda.jls.pojo.hasLearnExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class haslearnServiceImpl implements haslearnService{
    @Autowired
    hasLearnMapper hasLearnMapper;

    @Override
    public void addhasLearn(hasLearn hasLearn) {
        hasLearnMapper.insertSelective(hasLearn);
    }

    @Override
    public void deletehasLearnById(Integer id) {
        hasLearnMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updatehasLearn(hasLearn hasLearn) {
        hasLearnMapper.updateByPrimaryKeySelective(hasLearn);
    }

    @Override
    public hasLearn gethasLearnById(Integer id) {
        return hasLearnMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<hasLearn> listAllhasLearn() {
        hasLearnExample example = new hasLearnExample();
        return hasLearnMapper.selectByExample(example);
    }

    @Override
    public int gethasLearnCount() {
        hasLearnExample example = new hasLearnExample();
        return hasLearnMapper.selectByExample(example).size();
    }

    @Override
    public List<hasLearn> listhasLearnByUserId(Integer userId) {
        hasLearnExample example = new hasLearnExample();
        hasLearnExample.Criteria criteria=example.createCriteria();
        criteria.andUseridEqualTo(userId);
        return hasLearnMapper.selectByExample(example);
    }
}
