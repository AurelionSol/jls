package com.qpanda.jls.Service;

import com.qpanda.jls.Dao.WrongitemMapper;
import com.qpanda.jls.pojo.Wrongitem;
import com.qpanda.jls.pojo.WrongitemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class wrongItemServiceImpl implements wrongItemService{
    @Autowired
    WrongitemMapper wrongitemMapper;

    @Override
    public void addWrongitem(Wrongitem wrongitem) {
        wrongitemMapper.insertSelective(wrongitem);
    }

    @Override
    public void deleteWrongitemById(Integer id) {
        wrongitemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateWrongitem(Wrongitem wrongitem) {
        wrongitemMapper.updateByPrimaryKeySelective(wrongitem);
    }

    @Override
    public Wrongitem getWrongitemById(Integer id) {
        return wrongitemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Wrongitem> listAllWrongitem() {
        WrongitemExample example = new WrongitemExample();
        return wrongitemMapper.selectByExample(example);
    }

    @Override
    public int getWrongitemCount() {
        WrongitemExample example = new WrongitemExample();
        return wrongitemMapper.selectByExample(example).size();
    }

    @Override
    public List<Wrongitem> listWrongitemByUserId(Integer userId) {
        WrongitemExample example = new WrongitemExample();
        WrongitemExample.Criteria criteria=example.createCriteria();
        criteria.andWrongUseridEqualTo(userId);
        return wrongitemMapper.selectByExample(example);
    }
}
