package com.qpanda.jls.Service;

import com.qpanda.jls.Dao.SysCommentMapper;
import com.qpanda.jls.Dao.SysLogMapper;
import com.qpanda.jls.Dao.SysViewMapper;
import com.qpanda.jls.pojo.*;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SysServiceImpl implements SysService {

    @Autowired
    SysLogMapper sysLogMapper;
    @Autowired
    SysViewMapper sysViewMapper;
    @Autowired
    SysCommentMapper sysCommentMapper;

    @Override
    public void addLog(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }

    @Override
    public void addView(SysView sysView) {
        sysViewMapper.insertSelective(sysView);
    }

    @Override
    public void addComment(SysComment sysComment) {
        sysCommentMapper.insertSelective(sysComment);
    }

    @Override
    public int getLogCount() {
        SysLogExample example = new SysLogExample();
        return sysLogMapper.selectByExample(example).size();
    }

    @Override
    public int getViewCount() {
        SysViewExample example = new SysViewExample();
        return sysViewMapper.selectByExample(example).size();
    }

    @Override
    public int getCommentCount() {
        SysCommentExample example = new SysCommentExample();
        return sysCommentMapper.selectByExample(example).size();
    }

    @Override
    public List<SysLog> listAllLog() {
        SysLogExample example = new SysLogExample();
        return sysLogMapper.selectByExample(example);
    }

    @Override
    public List<SysView> listAllView() {
        SysViewExample example = new SysViewExample();
        return sysViewMapper.selectByExample(example);
    }

    @Override
    public List<SysComment> listAllComment() {
        SysCommentExample example = new SysCommentExample();
        return sysCommentMapper.selectByExample(example);
    }

    @Override
    public void deleteCommentById(Integer id) {
        sysCommentMapper.deleteByPrimaryKey(id);
    }
}
